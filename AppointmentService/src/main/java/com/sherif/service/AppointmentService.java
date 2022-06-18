package com.sherif.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherif.dto.CancelReason;
import com.sherif.entity.Appointment;
import com.sherif.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository; 
	
	public Appointment save(Appointment patient) {
		return appointmentRepository.save(patient);
	}
	
	public List<Appointment> getAll() {
		return appointmentRepository.findAll();
	}
	
	@Transactional
	public Appointment cancel(long id, CancelReason reason) {
		Appointment appointment= null;
		Optional<Appointment> optionalAppointment = appointmentRepository.findById(id);
		if(optionalAppointment.isPresent()) {
			appointment = optionalAppointment.get();
			appointment.setCancelled(true);
			appointment.setCancelReason(reason.getReason());
		}
		return appointment;	
		
		
	}
	
	
	
}
