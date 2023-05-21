package com.javainuse.cadre.request;

import java.math.BigInteger;
import java.util.Date;

public class ActivityRequest {

private BigInteger id;
	
	private BigInteger subCategoryId;
	
	
	private String performanceOutcome;
	
	
	private String performanceOutcomeUnit;
	
	
	private String paymentOutcome;
	
	
	private String paymentOutcomeUnit;
	
	
	private String activityName;
	
	
	private Integer status;
	
	
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	private Date deletedAt;
	private String deletedBy;
	
	
	public ActivityRequest(BigInteger id, BigInteger subCategoryId, String performanceOutcome,
			String performanceOutcomeUnit, String paymentOutcome, String paymentOutcomeUnit, String activityName,
			Integer status, Date createdAt, String createdBy, Date updatedAt, String updatedBy, Date deletedAt,
			String deletedBy) {
		super();
		this.id = id;
		this.subCategoryId = subCategoryId;
		this.performanceOutcome = performanceOutcome;
		this.performanceOutcomeUnit = performanceOutcomeUnit;
		this.paymentOutcome = paymentOutcome;
		this.paymentOutcomeUnit = paymentOutcomeUnit;
		this.activityName = activityName;
		this.status = status;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.deletedAt = deletedAt;
		this.deletedBy = deletedBy;
	}
	
	
	public ActivityRequest() {
		super();
		
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(BigInteger subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getPerformanceOutcome() {
		return performanceOutcome;
	}
	public void setPerformanceOutcome(String performanceOutcome) {
		this.performanceOutcome = performanceOutcome;
	}
	public String getPerformanceOutcomeUnit() {
		return performanceOutcomeUnit;
	}
	public void setPerformanceOutcomeUnit(String performanceOutcomeUnit) {
		this.performanceOutcomeUnit = performanceOutcomeUnit;
	}
	public String getPaymentOutcome() {
		return paymentOutcome;
	}
	public void setPaymentOutcome(String paymentOutcome) {
		this.paymentOutcome = paymentOutcome;
	}
	public String getPaymentOutcomeUnit() {
		return paymentOutcomeUnit;
	}
	public void setPaymentOutcomeUnit(String paymentOutcomeUnit) {
		this.paymentOutcomeUnit = paymentOutcomeUnit;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	
	
}
