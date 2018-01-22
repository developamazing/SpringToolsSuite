package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.BuildingDao;
import com.bis.nj.model.Buildings;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingDao dao;

	@Override
	public Buildings addBuildings(Buildings buildings) throws Exception {
		dao.saveAndFlush(buildings);
		return buildings;
	}

	@Override
	public List<Buildings> getBuildingDetails() throws Exception {
		return dao.findAll();
	}

	@Override
	public Buildings updateBuildings(Buildings buildings) throws Exception {
		if (Objects.equals(null, dao.findOne(buildings.getBuildingNo()))) {
			throw new IllegalArgumentException("no user found");
		}
		return dao.save(buildings);
	}

}
