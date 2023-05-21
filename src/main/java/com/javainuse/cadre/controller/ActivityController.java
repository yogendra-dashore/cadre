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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.cadre.entity.Activity;
import com.javainuse.cadre.request.ActivityRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.ActivityService;


@RestController
@RequestMapping("/cadre")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	
	@GetMapping("/list")
    public ResponseEntity<?> getActivityList(HttpServletRequest request) {
        Response<Activity> response = activityService.getActivityList(request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
        
    }

	 @RequestMapping(value = "/activity/save", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseEntity<?> saveActivity(@RequestBody ActivityRequest req){
		 Response<String> response = activityService.saveActivity(req);
	        return new ResponseEntity<Response>(response,HttpStatus.OK);
	        }

	@RequestMapping(value = "/activity/update/{id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> updateActivity(@PathVariable(value = "id")int id, @RequestBody ActivityRequest req,HttpServletRequest request) {
		Response<String> response = activityService.updateActivity(id,req,request);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/activity/deleteDetails/{id}")
	public ResponseEntity<?> deleteActivity(@PathVariable(value = "id")int id,ActivityRequest req) {
		Response<String> response = activityService.deleteActivity(id, req);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
		
	
	
	
	}
	
	
	
}
