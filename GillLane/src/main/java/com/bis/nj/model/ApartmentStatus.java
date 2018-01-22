package com.bis.nj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@javax.persistence.Table(name="ASSS")
@Table(name = "ASSS")
public class ApartmentStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "BUILDINGNO")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer buildingNo;

	@Column(name = "BUILDINGNAME")
	private String buildingName;
	
	@Column(name = "TOTALNO")
	private int totalno;
	
	@Column(name = "AVAILABLE")
	private int available;
	
	
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
	public Integer getTotalno() {
		return totalno;
	}
	public void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}
	public Integer getAvailable() {
		return available;
	}
	public void setAvailable(Integer available) {
		this.available = available;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + available;
		result = prime * result + ((buildingName == null) ? 0 : buildingName.hashCode());
		result = prime * result + ((buildingNo == null) ? 0 : buildingNo.hashCode());
		result = prime * result + totalno;
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
		ApartmentStatus other = (ApartmentStatus) obj;
		if (available != other.available)
			return false;
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
		if (totalno != other.totalno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ApartmentStatus [buildingNo=" + buildingNo + ", buildingName=" + buildingName + ", totalno=" + totalno
				+ ", available=" + available + "]";
	}

	

}
