package com.javainuse.cadre.service.impl;

import java.math.BigInteger;
import java.sql.Timestamp;
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

import com.javainuse.cadre.entity.Activity;
import com.javainuse.cadre.exception.HandledException;
import com.javainuse.cadre.helper.PageModel;
import com.javainuse.cadre.repository.ActivityRepository;
import com.javainuse.cadre.request.ActivityRequest;
import com.javainuse.cadre.response.Response;
import com.javainuse.cadre.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PageModel pageModel;
	
	@Override
	public Response<String> saveActivity(ActivityRequest req) {
		Response<String> response = new Response<>();
		try {	
        
                Activity activity = new Activity();
                activity.setId(req.getId());
                activity.setSubCategoryId(req.getSubCategoryId());
                activity.setPerformanceOutcome(req.getPerformanceOutcome());
                activity.setPerformanceOutcomeUnit(req.getPerformanceOutcomeUnit());
                activity.setPaymentOutcome(req.getPaymentOutcome());
                activity.setPaymentOutcomeUnit(req.getPaymentOutcomeUnit());
                activity.setActivityName(req.getActivityName());
                activity.setStatus(req.getStatus());
                activity.setCreatedAt(req.getCreatedAt());
                activity.setCreatedBy(req.getCreatedBy());
                activity.setUpdatedAt(req.getUpdatedAt());
                activity.setUpdatedBy(req.getUpdatedBy());
                activity.setDeletedAt(req.getDeletedAt());
                activity.setDeletedBy(req.getDeletedBy());
                activityRepo.save(activity);
                
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
	public Response<Activity> getActivityList(HttpServletRequest request) {
		Response<Activity> response = new Response<Activity>();
		    PageModel.setSIZE(20);
	        pageModel.initPageAndSize();
	        Page<Activity> activityList = null;
	        Long totalCount = Long.valueOf(0);
	        String errorMsg = null;
		
	        Page<Activity> activityPage = activityRepo.findAll(PageRequest.of(PageModel.getPAGE(), PageModel.getSIZE()));
	        List<Activity> activityResponse = activityPage.getContent().stream()
	              .map(feeddto -> modelMapper.map(feeddto, Activity.class)).collect(Collectors.toList());
	        		
	        response.setWrapperList(activityResponse);
	        response.setTotalcount(activityPage.getTotalElements());
	        response.setErrorMsg(errorMsg);
	        response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
	        response.setResponseDesc(HttpStatus.OK.name());
	        return response;
		
	}

	@Override
	public Response<String> updateActivity(int id, ActivityRequest req, HttpServletRequest request) {
		Response<String> response = new Response<String>();
		
		try {
			Optional<Activity> optionalActivity = activityRepo.findById(BigInteger.valueOf(id));
			if(optionalActivity.isPresent()) {
				Activity actmodel = optionalActivity.get();
				actmodel.setSubCategoryId(req.getId());
				actmodel.setPerformanceOutcome(req.getPerformanceOutcome());
				actmodel.setPerformanceOutcomeUnit(req.getPerformanceOutcomeUnit());
				actmodel.setPaymentOutcome(req.getPaymentOutcome());
				actmodel.setPaymentOutcomeUnit(req.getPaymentOutcomeUnit());
				actmodel.setActivityName(req.getActivityName());
				actmodel.setStatus(req.getStatus());
				actmodel.setCreatedAt(req.getCreatedAt());
				actmodel.setCreatedBy(req.getCreatedBy());
				actmodel.setUpdatedAt(req.getUpdatedAt());
				actmodel.setUpdatedBy(req.getUpdatedBy());
				actmodel.setDeletedAt(req.getDeletedAt());
				actmodel.setDeletedBy(req.getDeletedBy());
				activityRepo.save(actmodel);
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
            throw new HandledException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());}
	 }	

	@Override
	public Response<String> deleteActivity(int id, ActivityRequest req) {
		
		Response<String> response = new Response<String>();
		
		String errorMsg = null;
		if (id == 0) {
			throw new HandledException(HttpStatus.BAD_REQUEST, "No  Id Found");
		} else {

			Optional<Activity> optionalModule = activityRepo.findById(BigInteger.valueOf(id));
			if (optionalModule.isPresent()) {
				Activity modModel = optionalModule.get();
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				modModel.setId(req.getId());
				modModel.setSubCategoryId(req.getSubCategoryId());
				modModel.setPerformanceOutcome(req.getPerformanceOutcome());
				modModel.setPerformanceOutcomeUnit(req.getPerformanceOutcomeUnit());
				modModel.setPaymentOutcome(req.getPaymentOutcome());
				modModel.setPaymentOutcomeUnit(req.getPaymentOutcomeUnit());
				modModel.setActivityName(req.getActivityName());
				modModel.setStatus(req.getStatus());
				modModel.setCreatedAt(req.getCreatedAt());
				modModel.setCreatedBy(req.getCreatedBy());
				modModel.setUpdatedAt(req.getUpdatedAt());
				modModel.setUpdatedBy(req.getUpdatedBy());
				modModel.setDeletedAt(req.getDeletedAt());
				modModel.setDeletedBy(req.getDeletedBy());
				activityRepo.delete(modModel);
			} else {
				throw new HandledException(HttpStatus.UNPROCESSABLE_ENTITY, "Module not found");
			}
		}response.setErrorMsg(errorMsg);
		response.setResponseCode(String.valueOf(HttpStatus.OK.value()));
		response.setResponseDesc(HttpStatus.OK.name());
		return response;
	}

}