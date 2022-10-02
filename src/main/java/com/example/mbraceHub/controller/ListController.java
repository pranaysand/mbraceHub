package com.example.mbraceHub.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Handles requests for the Employee service.
 */
@Controller
public class ListController  {
	
	private static final Logger logger = LoggerFactory.getLogger(ListController .class);
	
	//Map to store employees, ideally we should use database
	
	@RequestMapping(value="/meals", method = RequestMethod.GET)
	public @ResponseBody String getMealsList() {
		logger.info("Start getDummyEmployee");
return "Test";
	}
	
	
}