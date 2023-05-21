package com.javainuse.cadre.service;




import java.util.List;

import javax.servlet.http.HttpServletRequest;



import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javainuse.cadre.entity.Activity;
import com.javainuse.cadre.entity.Category;
import com.javainuse.cadre.request.ActivityRequest;
import com.javainuse.cadre.response.ActivityListResponse;
import com.javainuse.cadre.response.Response;



public interface ActivityService {
//	public Activity saveActivityDetails(Activity activity);
//	public List<Activity> getActivityDetails(Activity activity) ;
//	public Activity updateActivityDetails(Activity activity);
//	public void deleteActivityDetails(BigInteger activity);
	
	Response<String> saveActivity(ActivityRequest req);
	 Response<Activity> getActivityList(HttpServletRequest request);
	 Response<String> updateActivity(int id,ActivityRequest req,HttpServletRequest request );
	 
	Response<String> deleteActivity(int id,ActivityRequest req);
	
	

	
	
	
	
	
	
	
	
}
