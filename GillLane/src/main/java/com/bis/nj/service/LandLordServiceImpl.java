package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.LandLordDao;
import com.bis.nj.model.LandLordDetails;

@Service
public class LandLordServiceImpl implements LandLordService {

	@Autowired
	private LandLordDao dao;


	@Override
	public LandLordDetails addNewLandLord(LandLordDetails details) throws Exception {
		dao.saveAndFlush(details);
		return details;
	}

	@Override
	public List<LandLordDetails> getLandLordDetails() throws Exception {
		return dao.findAll();
	}

	@Override
	public LandLordDetails updateLandLordDetails(LandLordDetails details) throws Exception {
		if (Objects.equals(null, dao.findOne(details.getApartmentNo()))) {
			throw new IllegalArgumentException("no user found");
		}
		return dao.save(details);
	}

}
