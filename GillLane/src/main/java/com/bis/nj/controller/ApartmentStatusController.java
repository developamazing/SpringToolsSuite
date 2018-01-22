package com.bis.nj.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.nj.model.ApartmentStatus;
import com.bis.nj.model.Buildings;
import com.bis.nj.service.AppartmentStatusService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@RestController
@RequestMapping("/as")
public class ApartmentStatusController {

	@Autowired
	private AppartmentStatusService service;
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addBuildings(@RequestBody ApartmentStatus As) {
		try {
			service.addBuildings(As);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/appartmentdetails",method=RequestMethod.GET)
	public List<ApartmentStatus> getBuildings() {
		try {
			return service.getBuildingDetails();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return  Collections.EMPTY_LIST;
	}
	
	@RequestMapping(value="/updateappartmentdetails",method=RequestMethod.PUT)
	public ApartmentStatus updateBuildings(@RequestBody ApartmentStatus As) {
		try {
			return service.updateBuildings(As);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return (ApartmentStatus) Collections.EMPTY_LIST;
	}

	
}
