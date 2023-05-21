package com.javainuse.cadre.service;

import javax.servlet.http.HttpServletRequest;

import com.javainuse.cadre.entity.SubCategory;
import com.javainuse.cadre.request.SubCategoryRequest;
import com.javainuse.cadre.response.Response;

public interface SubCategoryService {
//	public SubCategory saveSubCategoryDetails(SubCategory subcategory);
//	public List<SubCategory> getSubCategoryDetails(SubCategory subcategory) ;
//	public SubCategory updateSubCategoryDetails(SubCategory subcategory);
//	public void deleteSubCategoryDetails(BigInteger subcategory) ;
	
	 Response<String> saveSubCategory(SubCategoryRequest req);
	 
	 Response<SubCategory> getSubCategoryList(HttpServletRequest request);
	 
	 Response<String> updateSubCategory(int id,SubCategoryRequest req,HttpServletRequest request);
	 
	 Response<String> deleteSubCategory(int id, SubCategoryRequest req);
		
}
