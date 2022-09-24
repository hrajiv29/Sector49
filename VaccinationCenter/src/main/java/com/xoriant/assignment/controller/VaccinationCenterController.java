package com.xoriant.assignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.xoriant.assignment.entity.Citizen;
import com.xoriant.assignment.entity.VaccinationCenter;
import com.xoriant.assignment.model.RequiredResponse;
import com.xoriant.assignment.repository.CenterRepository;



@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired
	private CenterRepository centerRepository;

	@Autowired
	RestTemplate template ;
	
	@PostMapping(path = "/add")
	public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vaccinationCenter) {

		VaccinationCenter vaccinationCenterr = centerRepository.save(vaccinationCenter);

		return new ResponseEntity<>(vaccinationCenterr, HttpStatus.OK);

	}

	@RequestMapping(path = "/get/{id}")
	public ResponseEntity<VaccinationCenter> getCitizens(@PathVariable Integer id ) {
		
		Optional<VaccinationCenter> vaccinationCenter  = centerRepository.findById(id);

		return new ResponseEntity<>(vaccinationCenter.get(), HttpStatus.OK);

	}
	
	@RequestMapping(path = "/get")
	public ResponseEntity<List<VaccinationCenter>> getCitizens() {
		
		List<VaccinationCenter> vaccinationCenter  = centerRepository.findAll();

		return new ResponseEntity<>(vaccinationCenter, HttpStatus.OK);

	}
	
	@GetMapping(path = "/id/{id}")
	public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id) {
		RequiredResponse resp= new RequiredResponse();
		VaccinationCenter center = centerRepository.findById(id).get();
		resp.setVaccinationCenter(center);
		//java.util.List<Citizen> citizens =  (java.util.List<Citizen>) template.getForObject("http://citizen-service/citizen/id/"+id, List.class);
		//resp.setCitizens(citizens);
		return new ResponseEntity<>(resp,HttpStatus.OK);
	}
}
