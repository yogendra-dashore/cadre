package com.javainuse.cadre.entity;

import java.math.BigInteger;
import java.security.Timestamp;
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
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	
	@Column(name = "category_name")
	private String categoryName;
	
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
	
	public Category(BigInteger id, String categoryName, Integer status, Date createdAt, String createdBy, Date updatedAt,
			String updatedBy, Date deletedAt, String deletedBy) {
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
	
	public Category() {
		super();
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
	public void setCatogoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreatedat() {
		return createdAt;
	}
	public void setCreatedat(Date createdat) {
		this.createdAt = createdat;
	}
	public String getCreatedby() {
		return createdBy;
	}
	public void setCreatedby(String createdby) {
		this.createdBy = createdby;
	}
	public Date getUpdatedat() {
		return updatedAt;
	}
	public void setUpdatedat(Date updatedat) {
		this.updatedAt = updatedat;
	}
	public String getUpdatedby() {
		return updatedBy;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedBy = updatedby;
	}
	public Date getDeletedat() {
		return deletedAt;
	}
	public void setDeletedat(Date deletedat) {
		this.deletedAt = deletedat;
	}
	public String getDeletedby() {
		return deletedBy;
	}
	public void setDeletedby(String deletedby) {
		this.deletedBy = deletedby;
	}
//	public CategoryEntity save(CategoryEntity categoryEntity) {
//		return null;
//	}

	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", categoryName=" + categoryName + ", status=" + status + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + ", deletedBy=" + deletedBy + "]";
	}
	
	
}
