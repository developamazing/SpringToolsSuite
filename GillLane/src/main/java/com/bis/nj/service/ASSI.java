package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.ApartmentStatusDao;
import com.bis.nj.model.ApartmentStatus;

@Service
public class ASSI implements AppartmentStatusService {
	
	//private final Logger logger = Logger.getLogger(ASSI.class);
	@Autowired
	private ApartmentStatusDao dao;

	@Override
	public ApartmentStatus addBuildings(ApartmentStatus As) throws Exception {
		//logger.info("Inside addBuildings in Service");
		// TODO Auto-generated method stub
		dao.saveAndFlush(As);
		return As;
	}

	@Override
	public List<ApartmentStatus> getBuildingDetails() throws Exception {
		//logger.info("Inside getting List in Service");
		// TODO Auto-generated method stub
		return dao.findAll();
	
	}

	@Override
	public ApartmentStatus updateBuildings(ApartmentStatus As) throws Exception {
		//logger.info("Inside update List in Service");
		// TODO Auto-generated method stub
		if (Objects.equals(null, dao.findOne(As.getBuildingNo()))) {
			throw new IllegalArgumentException("no user found");
		}
		return dao.save(As);
	}

}
