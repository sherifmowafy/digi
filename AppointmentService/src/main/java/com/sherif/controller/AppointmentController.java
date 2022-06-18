package com.sherif.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sherif.entity.Appointment;
import com.sherif.service.AppointmentService;

@RestController
@RequestMapping(value = "/")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping
	public ResponseEntity<String> get(){
		return new ResponseEntity<>("Working...", HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Appointment> save(@RequestBody Appointment appointment){
		appointment = appointmentService.save(appointment);
		return new ResponseEntity<>(appointment, HttpStatus.OK);
	}

}
