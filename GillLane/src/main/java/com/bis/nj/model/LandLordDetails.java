package com.bis.nj.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LANDLORDDETAILS")
public class LandLordDetails implements Serializable {

	private static final long serialVersionUID = -5866706886187458559L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LANDLORDID")
	private Integer landlordid;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Buildings.class)
	@JoinColumn(name = "BUILDINGNO")
	private Buildings buildingNo;

	@Column(name = "APARTMENTNO")
	private Integer apartmentNo;

	@Column(name = "LANDLORDNAME")
	private String landLordName;

	@Column(name = "PHONENO")
	private String phoneNo;

	public Buildings getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(Buildings buildingNo) {
		this.buildingNo = buildingNo;
	}

	public Integer getApartmentNo() {
		return apartmentNo;
	}

	public void setApartmentNo(Integer apartmentNo) {
		this.apartmentNo = apartmentNo;
	}

	public String getLandLordName() {
		return landLordName;
	}

	public void setLandLordName(String landLordName) {
		this.landLordName = landLordName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apartmentNo == null) ? 0 : apartmentNo.hashCode());
		result = prime * result + ((buildingNo == null) ? 0 : buildingNo.hashCode());
		result = prime * result + ((landLordName == null) ? 0 : landLordName.hashCode());
		result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
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
		LandLordDetails other = (LandLordDetails) obj;
		if (apartmentNo == null) {
			if (other.apartmentNo != null)
				return false;
		} else if (!apartmentNo.equals(other.apartmentNo))
			return false;
		if (buildingNo == null) {
			if (other.buildingNo != null)
				return false;
		} else if (!buildingNo.equals(other.buildingNo))
			return false;
		if (landLordName == null) {
			if (other.landLordName != null)
				return false;
		} else if (!landLordName.equals(other.landLordName))
			return false;
		if (phoneNo == null) {
			if (other.phoneNo != null)
				return false;
		} else if (!phoneNo.equals(other.phoneNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LandLordDetails [buildingNo=");
		builder.append(buildingNo);
		builder.append(", apartmentNo=");
		builder.append(apartmentNo);
		builder.append(", landLordName=");
		builder.append(landLordName);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append("]");
		return builder.toString();
	}

}
