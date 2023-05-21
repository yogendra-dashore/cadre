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

import com.javainuse.cadre.entity.SubCategory;
import com.javainuse.cadre.exception.HandledException;
import com.javainuse.cadre.helper.PageModel;
import com.javainuse.cadre.repository.SubCategoryRepository;
import com.javainuse.cadre.request.SubCategoryRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	SubCategoryRepository subcategoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PageModel pageModel;
	
	@Override
	public Response<String> saveSubCategory(SubCategoryRequest req) {
		Response<String> response = new Response<String>();
		try {	
        
	                SubCategory category = new SubCategory();
	                category.setId(req.getId());
	                category.setCategoryId(req.getCategoryId());
	                category.setSubCategoryName(req.getSubCategoryName());
	                category.setStatus(req.getStatus());
	                category.setCreatedAt(req.getCreatedAt());
	                category.setCreatedBy(req.getCreatedBy());
	                category.setUpdatedAt(req.getUpdatedAt());
	                category.setUpdatedBy(req.getUpdatedBy());
	                category.setDeletedAt(req.getDeletedAt());
	                category.setDeletedBy(req.getDeletedBy());
	                subcategoryRepo.save(category);
	               
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
	public Response<SubCategory> getSubCategoryList(HttpServletRequest request) {
		Response<SubCategory> response = new Response<SubCategory>();
		 PageModel.setSIZE(20);
	        pageModel.initPageAndSize();
	        Page<SubCategory> subcategoryList = null;
	        Long totalCount = Long.valueOf(0);
	        String errorMsg = null;
	        Page<SubCategory> subcategoryPage = subcategoryRepo.findAll(PageRequest.of(PageModel.getPAGE(), PageModel.getSIZE()));
	        List<SubCategory> subcategoryResponse = subcategoryPage.getContent().stream()
	        		.map(feeddto -> modelMapper.map(feeddto, SubCategory.class)).collect(Collectors.toList());
	        
	        response.setWrapperList(subcategoryResponse);
	        response.setTotalcount(subcategoryPage.getTotalElements());
	        response.setErrorMsg(errorMsg);
	        response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
	        response.setResponseDesc(HttpStatus.OK.name());
	        return response;
	}

	@Override
	public Response<String> updateSubCategory(int id, SubCategoryRequest req, HttpServletRequest request) {
		Response<String> response = new Response<String>();
		try {
			Optional<SubCategory> optionalSubCategory = subcategoryRepo.findById(BigInteger.valueOf(id));
			if(optionalSubCategory.isPresent()) {
				SubCategory subcatmodel = optionalSubCategory.get();
				subcatmodel.setId(req.getId());
				subcatmodel.setCategoryId(req.getId());
				subcatmodel.setSubCategoryName(req.getSubCategoryName());
				subcatmodel.setStatus(req.getStatus());
				subcatmodel.setCreatedAt(req.getCreatedAt());
				subcatmodel.setCreatedBy(req.getCreatedBy());
				subcatmodel.setUpdatedAt(req.getUpdatedAt());
				subcatmodel.setUpdatedBy(req.getUpdatedBy());
				subcatmodel.setDeletedAt(req.getDeletedAt());
				subcatmodel.setDeletedBy(req.getDeletedBy());
				subcategoryRepo.save(subcatmodel);
		return response;
	}
			else {
        throw new HandledException(HttpStatus.UNPROCESSABLE_ENTITY, "Activity entry not found");
    }
			}
		catch (HandledException e) {
        e.printStackTrace();
        throw new HandledException(e.getCode(), e.getMessage());
			 }
		catch (Exception e) {
		            e.printStackTrace();
		            throw new HandledException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
			 }	  
		}

	@Override
	public Response<String> deleteSubCategory(int id, SubCategoryRequest req) {
		Response<String> response = new Response<String>();
		String errorMsg = null;
		if (id == 0) {
			throw new HandledException(HttpStatus.BAD_REQUEST, "No  Id Found");
		} else {
			Optional<SubCategory> optionalModule = subcategoryRepo.findById(BigInteger.valueOf(id));
			if (optionalModule.isPresent()) {
//				SubCategory modModel = optionalModule.get();
//				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//				modModel.setCategoryId(req.getCategoryId());
//				modModel.setSubCategoryName(req.getCreatedBy());
//				modModel.setStatus(req.getStatus());
//				modModel.setCreatedAt(req.getCreatedAt());
//				modModel.setCreatedBy(req.getCreatedBy());
//				modModel.setUpdatedAt(req.getUpdatedAt());
//				modModel.setUpdatedBy(req.getUpdatedBy());
//				modModel.setDeletedAt(req.getDeletedAt());
//				modModel.setDeletedBy(req.getDeletedBy());
				subcategoryRepo.delete(optionalModule.get());
			} else {
				throw new HandledException(HttpStatus.UNPROCESSABLE_ENTITY, "Module not found");
			}
		}
		response.setErrorMsg(errorMsg);
		response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
		response.setResponseDesc(HttpStatus.OK.name());
		return response;
	}
		
		
	
	
	
	

//	@Autowired
//	private SubCategoryRepository repo;
//	
//	@Autowired
//	private PageModel pageModel;
//
//	@Autowired
//	private SubCategoryListResponse response;
//	
//	@Autowired
//	private ModelMapper modelMapper;
//	
//	@Autowired
//	private SubCategorySpecification speci;
//	
//	@Override
//	public ResponseEntity<String> saveSubCategoryContentList(BigInteger id, SubCategoryRequest req,MultipartFile file) {
//		
//		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.OK);
//		try {	
//        
//                SubCategory category = new SubCategory();
//               // float size = file.getSize() / 1024;
//                category.setId(req.getId());
//                category.setCategoryId(req.getCategoryId());
//                category.setSubCategoryName(req.getSubCategoryName());
//                category.setStatus(req.getStatus());
//               // category.setPerformanceOutcomeUnit(req.getPerformanceOutcomeUnit());
//                //activity.setIsDeleted(1);
//               // activity.setPaymentOutcome(req.getPaymentOutcome());
//                //activity.setPaymentOutcomeUnit(req.getPaymentOutcomeUnit());
//               // activity.setActivityName(req.getActivityName());
//                //activity.setStatus(req.getStatus());
//                category.setCreatedAt(req.getCreatedAt());
//                category.setCreatedBy(req.getCreatedBy());
//                category.setUpdatedAt(req.getUpdatedAt());
//                category.setUpdatedBy(req.getUpdatedBy());
//                category.setDeletedAt(req.getDeletedAt());
//                category.setDeletedBy(req.getDeletedBy());
//               // activity.setApprovalDesignation(req.getApproverDesignation());
//               // activity.setKeyword(req.getKeyword()); 
//		return response;
//		
//		} catch (HandledException e) {
//			e.printStackTrace();
//			throw new HandledException(e.getCode(), e.getMessage());
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new HandledException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
//		}
//		
//	}
//
//	@Override
//	public ResponseEntity<SubCategoryListResponse> getSubCategoryList(HttpServletRequest request) {
//		
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<String> updateSubCategory(BigInteger id, SubCategoryRequest req, MultipartFile file) {
//		
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<String> deleteSubCategory(BigInteger id, SubCategory subcategory) {
//		
//		return null;
//	}

	
	
	
/*	public List<SubCategory> getSubCategoryDetails() {
		List<SubCategory> entity = null;
		entity = repo.findAll();
		return entity;
	}
	@Override
	public SubCategory saveSubCategoryDetails(SubCategory subcategory) {
		SubCategory category = new SubCategory();
		category = repo.save(subcategory);
		return category;
	}

	@Override
	public List<SubCategory> getSubCategoryDetails(SubCategory subcategory) {
		
		return null;
	}

	@Override
	public SubCategory updateSubCategoryDetails(SubCategory subcategory) {
		SubCategory entity=null;
		entity=repo.findById(subcategory.getId()).get();
		entity.setSubCategoryName(subcategory.getSubCategoryName());
		entity.setStatus(subcategory.getStatus());
		entity.setCreatedAt(subcategory.getCreatedAt());
		entity.setCreatedBy(subcategory.getCreatedBy());
		entity.setUpdatedAt(subcategory.getUpdatedAt());
		entity.setUpdatedBy(subcategory.getUpdatedBy());
		entity.setDeletedAt(subcategory.getDeletedAt());
		entity.setDeletedBy(subcategory.getDeletedBy());
		entity = repo.save(subcategory);
		return entity;
	}

	@Override
	public void deleteSubCategoryDetails(BigInteger subcategory) {
		repo.deleteById(subcategory);
		
	}
	

	*/
	
	
}
