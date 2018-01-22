package com.bis.nj.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.nj.model.Buildings;
import com.bis.nj.service.BuildingService;

@RestController
@RequestMapping("/building")
public class BuildingController {

	@Autowired
	private BuildingService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addBuildings(@RequestBody Buildings building) {
		try {
			service.addBuildings(building);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/buildingdetails",method=RequestMethod.GET)
	public List<Buildings> getBuildings() {
		try {
			return service.getBuildingDetails();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
	}
	
	@RequestMapping(value="/updatebuildings",method=RequestMethod.PUT)
	public Buildings updateBuildings(@RequestBody Buildings building) {
		try {
			return service.updateBuildings(building);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return (Buildings) Collections.EMPTY_LIST;
	}
	
}
