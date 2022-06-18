package com.sherif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherif.dto.PatientDto;
import com.sherif.entity.Patient;
import com.sherif.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository; 
	
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}
	
	public Patient save(PatientDto patientDto) {
		return patientRepository.save(mapDtoToPatient(patientDto));
	}
	
	private Patient mapDtoToPatient(PatientDto patientDto) {
		Patient p = new Patient();
		p.setName(patientDto.getName());
		return p;
	}
	
}
