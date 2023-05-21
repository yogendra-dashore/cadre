package com.javainuse.cadre.response;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

public class CategoryListResponse {

	private BigInteger id;
private String categoryName;
	
	private Integer status;
	
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	private Date deletedAt;
	private String deletedBy;
	
	
	
	public CategoryListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryListResponse(BigInteger id, String categoryName, Integer status, Date createdAt,
			String createdBy, Date updatedAt, String updatedBy, Date deletedAt, String deletedBy) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.status = status;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.deletedAt = deletedAt;
		this.deletedBy = deletedBy;
		
		
	}
	@Override
	public String toString() {
		return "CategoryContentListResponse [id=" + id + ", categoryName=" + categoryName + ", status=" + status
				+ ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy="
				+ updatedBy + ", deletedAt=" + deletedAt + ", deletedBy=" + deletedBy + "]";
	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
