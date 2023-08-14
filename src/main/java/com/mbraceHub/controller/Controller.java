package com.mbraceHub.controller;

import com.mbraceHub.hibernateSpecs.Availability;
import com.mbraceHub.hibernateSpecs.Institutions;
import com.mbraceHub.hibernateSpecs.Meals;
import com.mbraceHub.hibernateSpecs.InstitutionsRepository;
import com.mbraceHub.hibernateSpecs.AvailabilityRepository;
import com.mbraceHub.hibernateSpecs.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles all controllers
 */

@RestController
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	// @RequestMapping(value = "/meals", method = RequestMethod.GET)
	// public @ResponseBody String getMealsList() {
	// logger.info("Start getDummyEmployee");
	// return "Test";

	// List<Institutions> test = InstitutionsRepository.findAll();
	// System.out.println("test");
	// System.out.println(test.toString());
	// return InstitutionsRepository.findAll();
	// }

	@Autowired
	private MealsRepository MealsRepository;

	@GetMapping("/meals")
	public List<Meals> getMeals() {
		List<Meals> test = MealsRepository.findAll();
		System.out.println("test");
		System.out.println(test.toString());
		return MealsRepository.findAll();
	}

	@Autowired
	private InstitutionsRepository InstitutionsRepository;

	@GetMapping("/institutions")
	public List<Institutions> getInstitutions() {
		List<Institutions> test = InstitutionsRepository.findAll();
		System.out.println("test");
		System.out.println(test.toString());
		return InstitutionsRepository.findAll();
	}

	@Autowired
	private AvailabilityRepository AvailabilityRepository;

	@GetMapping("/availability")
	public List<Availability> getAvailability() {
		List<Availability> test = AvailabilityRepository.findAll();
		System.out.println("test");
		System.out.println(test.toString());
		return AvailabilityRepository.findAll();
	}
}