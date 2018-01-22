package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.ApartmentStatusDao;
import com.bis.nj.model.ApartmentStatus;

@Service
public class ASSI implements AppartmentStatusService {
	
	@Autowired
	private ApartmentStatusDao dao;

	@Override
	public ApartmentStatus addBuildings(ApartmentStatus As) throws Exception {
		// TODO Auto-generated method stub
		dao.saveAndFlush(As);
		return As;
	}

	@Override
	public List<ApartmentStatus> getBuildingDetails() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	
	}

	@Override
	public ApartmentStatus updateBuildings(ApartmentStatus As) throws Exception {
		// TODO Auto-generated method stub
		if (Objects.equals(null, dao.findOne(As.getBuildingNo()))) {
			throw new IllegalArgumentException("no user found");
		}
		return dao.save(As);
	}

}
