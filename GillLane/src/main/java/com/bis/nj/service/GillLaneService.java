package com.bis.nj.service;

import java.util.List;

import com.bis.nj.model.GillLaneModel;

public interface GillLaneService {
	
	public GillLaneModel addMember(GillLaneModel details) throws Exception;
	
	public List<GillLaneModel> getMembers() throws Exception;

	public GillLaneModel updateMember(GillLaneModel details) throws Exception;


}
