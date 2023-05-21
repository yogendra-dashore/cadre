

package com.javainuse.cadre.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.cadre.entity.Category;
import com.javainuse.cadre.request.CategoryRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.CategoryService;



@RestController
@RequestMapping("/cadre")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
/**
 *Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
 *entity instance completely.
 *
 * @param category
 * @return entity
 */

	 @RequestMapping(value = "/cate/save", method = RequestMethod.POST)
	 @ResponseBody
	public ResponseEntity<?> saveCategory(@RequestBody CategoryRequest req) {
		 Response<String> response = categoryService.saveCategory(req);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

	@GetMapping("/cate/list")
	public ResponseEntity<?> getCategoryList(HttpServletRequest request) {
		Response<Category> response = categoryService.getCategoryList(request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/cate/update/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> updateCategory(@PathVariable(value = "id")int id,@RequestBody CategoryRequest req,HttpServletRequest request){
		Response<String> response = categoryService.updateCategory(id, req,request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@DeleteMapping("/cate/deleteDetails/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable(value = "id") int id,CategoryRequest req) {
		Response<String> response = categoryService.deleteCategory(id, req);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
