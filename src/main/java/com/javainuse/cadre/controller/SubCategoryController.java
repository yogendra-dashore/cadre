package com.javainuse.cadre.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.cadre.entity.SubCategory;
import com.javainuse.cadre.request.SubCategoryRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.SubCategoryService;

@RestController
@RequestMapping("/cadre")
public class SubCategoryController {
	
	@Autowired
	SubCategoryService subCategoryService;
	
	@PostMapping(value = "/subcate/save")
	@ResponseBody
	public ResponseEntity<?> saveSubCategory(@RequestBody SubCategoryRequest req) {
		Response<String> response = subCategoryService.saveSubCategory(req);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@GetMapping("/subcate/list")
	public ResponseEntity<?> getSubCategoryList(HttpServletRequest request) {
		Response<SubCategory> response = subCategoryService.getSubCategoryList(request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/subcate/update/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> updateSubCategory(@PathVariable(value = "id")int id,@RequestBody SubCategoryRequest req,HttpServletRequest request)
			 {
		Response<String> response = subCategoryService.updateSubCategory(id,req,request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@DeleteMapping("/subcate/deleteDetails/{id}")
	public ResponseEntity<?> deleteSubCategory(@PathVariable(value = "id")int id,SubCategoryRequest req) {
		Response<String> response = subCategoryService.deleteSubCategory(id, req);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
