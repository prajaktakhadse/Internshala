package com.learn.halodoc.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.halodoc.entity.Patient;
import com.learn.halodoc.payloads.PatientDtos;
import com.learn.halodoc.repository.PatientRepo;

public class PatientServiceImpl implements PatientService{

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PatientRepo patientRepo;
	
	
	@Override
	public Patient createpatient(Patient patient) {
		Patient p = this.patientRepo.save(patient);
		return p;
	}

}
