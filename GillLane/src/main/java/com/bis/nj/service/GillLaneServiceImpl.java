package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.GillLaneDao;
import com.bis.nj.model.Details;

@Service
public class GillLaneServiceImpl implements GillLaneService {
	
	 
	private Logger log = Logger.getLogger(GillLaneServiceImpl.class);
	@Autowired
	private GillLaneDao dao;

	@Override
	public Details addMember(Details details) throws Exception {
		dao.saveAndFlush(details);
		return details;
	}
	
	@Override
	public List<Details> getMembers() throws Exception {
		log.info("in service class");
		return dao.findAll();
	}

	@Override
	public Details updateMember(Details details) throws Exception {
		// TODO Auto-generated method stub 
		if (Objects.equals(null, dao.findOne(details.getMemberId()))){
			throw new IllegalArgumentException("no user found");
		}
		 return dao.save(details);
	}

}
