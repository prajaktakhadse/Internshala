package com.learn.halodoc.service;

import java.util.List;


import com.learn.halodoc.payloads.PatientDtos;

public interface PatientService {

	PatientDtos createpatient(PatientDtos patient);
	
	PatientDtos updatePatient(PatientDtos patientDtos, Integer patitentId);
	
	PatientDtos getPatientById(Integer patientId);
	
	List<PatientDtos> getAllPatient();
	
	void deletePatient(Integer PatientId);
	
}
