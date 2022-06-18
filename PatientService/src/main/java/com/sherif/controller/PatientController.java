package com.sherif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherif.entity.Patient;
import com.sherif.service.PatientService;

@RestController
@RequestMapping(value = "/")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping
	public ResponseEntity<String> get(){
		return new ResponseEntity<>("Working...", HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Patient> save(@RequestBody Patient patient){
		patient = patientService.save(patient);
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}

}
