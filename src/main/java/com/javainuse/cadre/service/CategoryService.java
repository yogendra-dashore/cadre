package com.javainuse.cadre.service;

import java.math.BigInteger;
import javax.servlet.http.HttpServletRequest;
import com.javainuse.cadre.entity.Category;
import com.javainuse.cadre.request.CategoryRequest;
import com.javainuse.cadre.response.Response;

public interface CategoryService {
//	public Category saveCategoryDetails(Category category);
//	public List<Category> getCategoryDetails(Category category) ;
//	public Category updateCategoryDetails(Category category);
//	public void deleteCategoryDetails(BigInteger category);
	//Response<String> saveCategory(CategoryRequest req);
	
	Response<String> saveCategory(CategoryRequest req);
	
	 Response<Category> getCategoryList(HttpServletRequest request);
	 
	 Response<String> updateCategory(int id,CategoryRequest req,HttpServletRequest request);
	 
	Response<String> deleteCategory(int id, CategoryRequest req);
}
