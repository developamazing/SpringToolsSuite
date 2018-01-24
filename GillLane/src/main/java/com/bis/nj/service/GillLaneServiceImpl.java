package com.bis.nj.service;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bis.nj.dao.GillLaneDao;
import com.bis.nj.model.GillLaneModel;

@Service
public class GillLaneServiceImpl implements GillLaneService {
	
	 
	private Logger log = Logger.getLogger(GillLaneServiceImpl.class);
	@Autowired
	private GillLaneDao dao;

	@Override
	public GillLaneModel addMember(GillLaneModel details) throws Exception {
		dao.saveAndFlush(details);
		return details;
	}
	
	@Override
	public List<GillLaneModel> getMembers() throws Exception {
		log.info("in service class");
		return dao.findAll();
	}

	@Override
	public GillLaneModel updateMember(GillLaneModel details) throws Exception {
		// TODO Auto-generated method stub 
		if (Objects.equals(null, dao.findOne(details.getMemberId()))){
			throw new IllegalArgumentException("no user found");
		}
		 return dao.save(details);
	}

}
