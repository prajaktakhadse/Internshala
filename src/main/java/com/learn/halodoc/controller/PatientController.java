package com.learn.halodoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.halodoc.entity.Patient;
import com.learn.halodoc.payloads.PatientDtos;
import com.learn.halodoc.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Hospital/")
public class PatientController {
  
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/addPatient")
	public ResponseEntity<Patient> createPatient(@Valid @RequestBody Patient patientDtos){
		Patient adddp = this.patientService.createpatient(patientDtos);
		return new ResponseEntity<>(adddp,HttpStatus.CREATED );
	}
}
