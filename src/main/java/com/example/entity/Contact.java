package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId; 
	 
	@Column(name="CONTACT_NAME") 
	private String contactName; 
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name="CONTACT_NO")
	private Long contactNo;
	
	@Column(name="ACTIVE_SWITCH")
	private Character activeSwitch;
	
	@Column(name="CONTACT_CREATEDATE")
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="CONTACT_UPDATEDATE")
	@UpdateTimestamp
	private LocalDate updateDate;

	
	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Character getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactNo=" + contactNo + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}

	




	
	
}
