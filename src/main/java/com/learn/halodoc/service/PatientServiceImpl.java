package com.learn.halodoc.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.halodoc.entity.Patient;
import com.learn.halodoc.payloads.PatientDtos;
import com.learn.halodoc.repository.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public PatientDtos createpatient(PatientDtos patient) {
		Patient p = this.modelMapper.map(patient, Patient.class);
		Patient addPatient = this.patientRepo.save(p);
		return this.modelMapper.map(addPatient, PatientDtos.class);
	}


	@Override
	public PatientDtos updatePatient(PatientDtos patientDtos, Integer patitentId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PatientDtos getPatientById(Integer patientId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<PatientDtos> getAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deletePatient(Integer PatientId) {
		// TODO Auto-generated method stub
		
	}

}
