package com.bis.nj.model;

import java.io.Serializable;
import java.sql.Date;

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
	private Integer noOfAparments; 

	@Column(name = "ISRENTABLE")
	private Boolean isRentable;
	
	@Column(name = "CREATEDBY")
	private String createdBy; 
	
	@Column(name = "CREATEDTIME")
	private Date createdTime; 
	
	@Column(name = "LASTUPDATEDBY")
	private String lastUpdatedBy; 
	
	@Column(name = "LASTUPDATEDTIME")
	private Date lastUpdateTime;

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

	public Integer getNoOfAparments() {
		return noOfAparments;
	}

	public void setNoOfAparments(Integer noOfAparments) {
		this.noOfAparments = noOfAparments;
	}

	public Boolean getIsRentable() {
		return isRentable;
	}

	public void setIsRentable(Boolean isRentable) {
		this.isRentable = isRentable;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((buildingNo == null) ? 0 : buildingNo.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((isRentable == null) ? 0 : isRentable.hashCode());
		result = prime * result + ((lastUpdateTime == null) ? 0 : lastUpdateTime.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
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
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (isRentable == null) {
			if (other.isRentable != null)
				return false;
		} else if (!isRentable.equals(other.isRentable))
			return false;
		if (lastUpdateTime == null) {
			if (other.lastUpdateTime != null)
				return false;
		} else if (!lastUpdateTime.equals(other.lastUpdateTime))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
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
		StringBuilder builder = new StringBuilder();
		builder.append("Buildings [buildingNo=");
		builder.append(buildingNo);
		builder.append(", buildingName=");
		builder.append(buildingName);
		builder.append(", noOfAparments=");
		builder.append(noOfAparments);
		builder.append(", isRentable=");
		builder.append(isRentable);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append(", lastUpdatedBy=");
		builder.append(lastUpdatedBy);
		builder.append(", lastUpdateTime=");
		builder.append(lastUpdateTime);
		builder.append("]");
		return builder.toString();
	}
		
}
