package com.javainuse.cadre.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="activity")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	
	@Column(name = "sub_category_id")
	private BigInteger subCategoryId;
	
	@Column(name = "performance_outcome")
	private String performanceOutcome;
	
	@Column(name = "performance_outcome_unit")
	private String performanceOutcomeUnit;
	
	@Column(name = "payment_outcome")
	private String paymentOutcome;
	
	@Column(name = "payment_outcome_unit")
	private String paymentOutcomeUnit;
	
	@Column(name = "activity_name")
	private String activityName;
	
	@Column(name = "status")
	private Integer status;
	
	@CreationTimestamp
	@Column(name = "created_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@CreationTimestamp
	@Column(name = "updated_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	
	@CreationTimestamp
	@Column(name = "deleted_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date deletedAt;
	
	@Column(name = "deleted_by")
	private String deletedBy;
	
	public Activity(BigInteger id, BigInteger subCategoryId, String performanceOutcome,
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
	
	public Activity() {
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

	

	@Override
	public String toString() {
		return "Activity [id=" + id + ", subCategoryId=" + subCategoryId + ", performanceOutcome="
				+ performanceOutcome + ", performanceOutcomeUnit=" + performanceOutcomeUnit + ", paymentOutcome="
				+ paymentOutcome + ", paymentOutcomeUnit=" + paymentOutcomeUnit + ", activityName=" + activityName
				+ ", status=" + status + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt="
				+ updatedAt + ", updatedBy=" + updatedBy + ", deletedAt=" + deletedAt + ", deletedBy=" + deletedBy
				+ "]";
	}

	public void setActivity() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
