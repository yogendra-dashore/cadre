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
@Table(name="subCategory")
public class SubCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "category_id")
	private BigInteger categoryId;
	
	@Column(name = "sub_category_name")
	private String subCategoryName;
	
	@Column(name = "status")
	private Integer status;
	
	
	@CreationTimestamp
	@Column(name = "created_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name = "created_By")
	private String createdBy;
	
	@CreationTimestamp
	@Column(name = "updated_at",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Column(name = "updated_By")
	private String updatedBy;
	
	@CreationTimestamp
	@Column(name = "deleted_At",nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date deletedAt;
	
	@Column(name = "deleted_By")
	private String deletedBy;
	
	public SubCategory(BigInteger id, BigInteger categoryId, String subCategoryName, Integer status,
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

	public SubCategory() {
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

	@Override
	public String toString() {
		return "SubCategoryEntity [id=" + id + ", categoryId=" + categoryId + ", subCategoryName=" + subCategoryName
				+ ", status=" + status + ", createdAt=" + createdAt + ", createdBy=" + createdBy + ", updatedAt="
				+ updatedAt + ", updatedBy=" + updatedBy + ", deletedAt=" + deletedAt + ", deletedBy=" + deletedBy
				+ "]";
	}

	
	
	
	
	
	
}






