package com.bis.nj.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.nj.model.Details;
import com.bis.nj.service.GillLaneService;

@RestController
@RequestMapping("/gilllane")
public class GillLaneController {

	@Autowired
	private GillLaneService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addMember(@RequestBody Details details) {
		try {
			service.addMember(details);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/members",method=RequestMethod.GET)
	public List<Details> getMembers() {
		try {
			return service.getMembers();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Collections.EMPTY_LIST;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Details updateMember(@RequestBody Details details) {
		try {
			return service.updateMember(details);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return (Details) Collections.EMPTY_LIST;
	}
	
}
