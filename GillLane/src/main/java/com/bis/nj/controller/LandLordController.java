package com.bis.nj.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.nj.model.LandLordDetails;
import com.bis.nj.service.LandLordService;

@RestController
@RequestMapping("/landlorddetails")
public class LandLordController {

	@Autowired
	private LandLordService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addNewLandLord(@RequestBody LandLordDetails details) {
		try {
			service.addNewLandLord(details);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/members",method=RequestMethod.GET)
	public List<LandLordDetails> getLandLorddetails() {
		try {
			return service.getLandLordDetails();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public LandLordDetails updateLandLord(@RequestBody LandLordDetails details) {
		try {
			return service.updateLandLordDetails(details);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return (LandLordDetails) Collections.EMPTY_LIST;
	}
	
}
