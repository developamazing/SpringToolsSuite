package com.bis.nj.service;

import java.util.List;

import com.bis.nj.model.ApartmentStatus;

public interface AppartmentStatusService {
	
	
	
	public ApartmentStatus addBuildings( ApartmentStatus As ) throws Exception;
	public List<ApartmentStatus>  getBuildingDetails() throws Exception;
	public ApartmentStatus updateBuildings( ApartmentStatus As ) throws Exception;
	


}
