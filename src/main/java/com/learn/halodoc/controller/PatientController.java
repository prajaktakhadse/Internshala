package com.learn.halodoc.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.halodoc.payloads.ApiResponse;
import com.learn.halodoc.payloads.PatientDtos;
import com.learn.halodoc.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Hospital/")
public class PatientController {
  
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/addPatient")
	public ResponseEntity<PatientDtos> createPatient(@Valid @RequestBody PatientDtos patientDtos){
		PatientDtos createpatientDtos = this.patientService.createpatient(patientDtos);
		return new ResponseEntity<PatientDtos>(createpatientDtos, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updatePatient/{patientId}")
	public ResponseEntity<PatientDtos> updatePatient(@Valid @RequestBody PatientDtos patientDtos,
			@PathVariable("patientId") Integer pid){
		PatientDtos updatePatient = this.patientService.updatePatient(patientDtos, pid);
		return new ResponseEntity<PatientDtos>(updatePatient, HttpStatus.OK);
	}
	
	@GetMapping("/getPatient/{patientId}")
	public ResponseEntity<PatientDtos> getPatientById(@PathVariable("patientId") Integer pid){
		PatientDtos patientById = this.patientService.getPatientById(pid);
		return new ResponseEntity<PatientDtos>(patientById,HttpStatus.OK);
	}
	
	@GetMapping("/getAllPatient")
	public ResponseEntity<List<PatientDtos>> getAllPatient(){
		return ResponseEntity.ok(this.patientService.getAllPatient());
	}
	

	@DeleteMapping("/{patientId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("patientId") Integer pid){
		this.patientService.deletePatient(pid);
		//return new ResponseEntity<>(Map.of("message", "User Deleted Successfully"), HttpStatus.OK);
	     return new ResponseEntity<ApiResponse>(new ApiResponse("Patient Deleted Successfully",false),HttpStatus.OK);
    }
	
	@GetMapping("/currentUser")
	public String getloggedInUser(Principal principal)
	{
		return principal.getName();
	}
}
