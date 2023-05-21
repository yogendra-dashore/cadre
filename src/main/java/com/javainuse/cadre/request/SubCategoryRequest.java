package com.javainuse.cadre.request;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

public class SubCategoryRequest {
	
	private BigInteger id;

	private BigInteger categoryId;
	
	private String subCategoryName;
	
	private Integer status;
	
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	private Date deletedAt;
	private String deletedBy;
	
	
	
	public SubCategoryRequest(BigInteger id, BigInteger categoryId, String subCategoryName, Integer status,
			Date createdAt, String createdBy, Date updatedAt, String updatedBy, Date deletedAt, String deletedBy) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.subCategoryName = subCategoryName;
		this.status = status;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.deletedAt = deletedAt;
		this.deletedBy = deletedBy;
	}
	public SubCategoryRequest() {
		super();
		
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(BigInteger categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
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
