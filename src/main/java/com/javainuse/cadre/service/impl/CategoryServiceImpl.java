package com.javainuse.cadre.service.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.javainuse.cadre.entity.Category;
import com.javainuse.cadre.exception.HandledException;
import com.javainuse.cadre.helper.PageModel;
import com.javainuse.cadre.repository.CategoryRepository;
import com.javainuse.cadre.request.CategoryRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PageModel pageModel;
	
	@Override
	public Response<String> saveCategory(CategoryRequest req) {
		Response<String> response = new Response<>();
		try {	
	        
	                Category category = new Category();
	                category.setId(req.getId());
	                category.setCatogoryName(req.getCategoryName());
	                category.setStatus(req.getStatus());
	                category.setCreatedat(req.getCreatedAt());
	                category.setCreatedby(req.getCreatedBy());
	                category.setUpdatedat(req.getUpdatedAt());
	                category.setUpdatedby(req.getUpdatedBy());
                    category.setDeletedat(req.getDeletedAt());
	                category.setDeletedby(req.getDeletedBy());
                    categoryRepo.save(category);
	                
			return response;
			
			} catch (HandledException e) {
				e.printStackTrace();
				throw new HandledException(e.getCode(), e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				throw new HandledException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
			}
			
		
		
	
	}

	@Override
	public Response<Category> getCategoryList(HttpServletRequest request) {
		
		Response<Category> response = new Response<Category>();
		 PageModel.setSIZE(20);
	        pageModel.initPageAndSize();
	        Page<Category> categoryList = null;
	        Long totalCount = Long.valueOf(0);
	        String errorMsg = null;
		
	        Page<Category> categoryPage = categoryRepo.findAll(PageRequest.of(PageModel.getPAGE(), PageModel.getSIZE()));
	        List<Category> categoryResponse = categoryPage.getContent().stream()
	        		.map(feeddto -> modelMapper.map(feeddto, Category.class)).collect(Collectors.toList());
	        
	        response.setWrapperList(categoryResponse);
	        response.setTotalcount(categoryPage.getTotalElements());
	        response.setErrorMsg(errorMsg);
	        response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
	        response.setResponseDesc(HttpStatus.OK.name());
	        return response;
	
	}

	@Override
	public Response<String> updateCategory(int id, CategoryRequest req, HttpServletRequest request) {
		Response<String> response = new Response<String>();
		

		try {
			Optional<Category> optionalCategory = categoryRepo.findById(BigInteger.valueOf(id));
			if(optionalCategory.isPresent()) {
				Category catmodel = optionalCategory.get();
				catmodel.setId(req.getId());
				catmodel.setCatogoryName(req.getCategoryName());
				catmodel.setStatus(req.getStatus());
				catmodel.setCreatedat(req.getCreatedAt());
				catmodel.setCreatedby(req.getCreatedBy());
				catmodel.setUpdatedat(req.getUpdatedAt());
				catmodel.setUpdatedby(req.getUpdatedBy());
				catmodel.setDeletedat(req.getDeletedAt());
				catmodel.setDeletedby(req.getDeletedBy());
				categoryRepo.save(catmodel);
				return response;
			}
			else {
                throw new HandledException(HttpStatus.UNPROCESSABLE_ENTITY, "Category entry not found");
            }
	}catch (HandledException e) {
        e.printStackTrace();
        throw new HandledException(e.getCode(), e.getMessage());
	}catch (Exception e) {
        e.printStackTrace();
        throw new HandledException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
    }
		}

	@Override
	public Response<String> deleteCategory(int id, CategoryRequest req) {
		
		Response<String> response = new Response<String>();
		
		String errorMsg = null;
		if(id==0){
			throw new HandledException(HttpStatus.BAD_REQUEST, "No  Id Found");
		} else {
			Optional<Category> optionalModule = categoryRepo.findByid(BigInteger.valueOf(id));
			if (optionalModule.isPresent()) {
//				Category modModel = optionalModule.get();
//				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//				modModel.setId(req.getId());
//				modModel.setCatogoryName(req.getCategoryName());
//				modModel.setStatus(req.getStatus());
//				modModel.setCreatedat(req.getCreatedAt());
//				modModel.setCreatedby(req.getCreatedBy());
//				modModel.setUpdatedat(req.getUpdatedAt());
//				modModel.setUpdatedby(req.getUpdatedBy());
//				modModel.setDeletedat(req.getDeletedAt());
//				modModel.setDeletedby(req.getDeletedBy());
				categoryRepo.delete(optionalModule.get());
			} else {
				throw new HandledException(HttpStatus.UNPROCESSABLE_ENTITY, "Module not found");
			}
		}response.setErrorMsg(errorMsg);
		response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
		response.setResponseDesc(HttpStatus.OK.name());
		return response;
	}
}
