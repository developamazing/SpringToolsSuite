package com.bis.nj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUILDINGS")

public class Buildings implements Serializable {

	private static final long serialVersionUID = 6445848793360295200L;

	@Id
	@Column(name = "BUILDINGNO")
	private Integer buildingNo;

	@Column(name = "BUILDINGNAME")
	private String buildingName;
	@Column(name = "NOOFAPARMENTS")
	private String noOfAparments; // int

	Boolean isRentable;
	
	public Integer getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(Integer buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getNoOfAparments() {
		return noOfAparments;
	}

	public void setNoOfAparments(String noOfAparments) {
		this.noOfAparments = noOfAparments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((buildingNo == null) ? 0 : buildingNo.hashCode());
		result = prime * result + ((noOfAparments == null) ? 0 : noOfAparments.hashCode());
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
		Buildings other = (Buildings) obj;
		if (buildingName == null) {
			if (other.buildingName != null)
				return false;
		} else if (!buildingName.equals(other.buildingName))
			return false;
		if (buildingNo == null) {
			if (other.buildingNo != null)
				return false;
		} else if (!buildingNo.equals(other.buildingNo))
			return false;
		if (noOfAparments == null) {
			if (other.noOfAparments != null)
				return false;
		} else if (!noOfAparments.equals(other.noOfAparments))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Buildings [buildingNo=" + buildingNo + ", buildingName=" + buildingName + ", noOfAparments="
				+ noOfAparments + "]";
	}

}
