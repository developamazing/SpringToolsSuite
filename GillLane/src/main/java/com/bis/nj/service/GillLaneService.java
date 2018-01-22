package com.bis.nj.service;

import java.util.List;

import com.bis.nj.model.Details;

public interface GillLaneService {
	
	public Details addMember(Details details) throws Exception;
	
	public List<Details> getMembers() throws Exception;

	public Details updateMember(Details details) throws Exception;


}
