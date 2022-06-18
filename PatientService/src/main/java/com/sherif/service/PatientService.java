package com.sherif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherif.entity.Patient;
import com.sherif.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository; 
	
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}
	
}
