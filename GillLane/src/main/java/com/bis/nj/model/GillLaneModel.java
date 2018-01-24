package com.bis.nj.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBERDETAILS")
public class GillLaneModel implements Serializable {

	private static final long serialVersionUID = -8431057680523826961L;

	@Id
	@Column(name="MEMBERID")
	private Integer memberId;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="EMAILID")
	private String emailId;
	@Column(name="PHONENO")
	private String phoneno;
	@Column(name="CREATEDBY")
	private Integer createdBy;
	@Column(name="UPDATEDBY")
	private String updatedBy;
	@Column(name="CREATEDON")
	private Date createdOn;
	@Column(name="ISTENANT")
	private String isTenant;
	
	public Integer getMemberId() {
		return memberId;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getIsTenant() {
		return isTenant;
	}

	public void setIsTenant(String isTenant) {
		this.isTenant = isTenant;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + memberId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneno == null) ? 0 : phoneno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GillLaneModel other = (GillLaneModel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (memberId != other.memberId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneno == null) {
			if (other.phoneno != null)
				return false;
		} else if (!phoneno.equals(other.phoneno))
			return false;
		return true;
	}
	
	
	

}
