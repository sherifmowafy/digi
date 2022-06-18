package com.sherif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherif.entity.Appointment;
import com.sherif.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository; 
	
	public Appointment save(Appointment patient) {
		return appointmentRepository.save(patient);
	}
	
}
