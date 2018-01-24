package com.bis.nj.controller;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.nj.model.ApartmentStatus;
import com.bis.nj.service.AppartmentStatusService;

@RestController
@RequestMapping("/as")
public class ApartmentStatusController {
	
	final static Logger logger =Logger.getLogger(ApartmentStatusController.class);

	//logger.info("Nodes and edges are created");
	@Autowired
	private AppartmentStatusService service;
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addBuildings(@RequestBody ApartmentStatus As) {
		logger.info("Inside addBuildings");
		try {
			service.addBuildings(As);
			logger.info("Inside addBuildings Service");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.info("Inside addBuildings Exception");
		}
	}
	
	@RequestMapping(value="/appartmentdetails",method=RequestMethod.GET)
	public List<ApartmentStatus> getBuildings() {
		logger.info("Inside geting list");
		try {
			logger.info("Inside geting list Service");
			return service.getBuildingDetails();
		}
		catch(Exception e) {
			logger.info("Inside geting list Exception");
			e.printStackTrace();
		}
		return  Collections.EMPTY_LIST;
	}
	
	@RequestMapping(value="/updateappartmentdetails",method=RequestMethod.PUT)
	public ApartmentStatus updateBuildings(@RequestBody ApartmentStatus As) {
		logger.info("Inside updating appartments");
		try {
			logger.info("Inside updating appartments Service");
			return service.updateBuildings(As);
		}
		catch(Exception e) {
			logger.info("Inside updating appartments exception");
			e.printStackTrace();
		}
		return (ApartmentStatus) Collections.EMPTY_LIST;
	}

	
}
