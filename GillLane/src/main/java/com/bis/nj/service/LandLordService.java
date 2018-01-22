package com.bis.nj.service;

import java.util.List;

import com.bis.nj.model.LandLordDetails;


public interface LandLordService {
	
	public LandLordDetails addNewLandLord(LandLordDetails details) throws Exception;

	public List<LandLordDetails> getLandLordDetails() throws Exception;

	public LandLordDetails updateLandLordDetails(LandLordDetails details) throws Exception;

}
