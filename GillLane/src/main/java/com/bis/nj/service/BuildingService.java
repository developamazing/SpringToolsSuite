package com.bis.nj.service;

import java.util.List;

import com.bis.nj.model.Buildings;

public interface BuildingService {

	public Buildings addBuildings(Buildings buildings) throws Exception;

	public List<Buildings> getBuildingDetails() throws Exception;

	public Buildings updateBuildings(Buildings buildings) throws Exception;
}
