package com.learn.halodoc.service;

import org.springframework.stereotype.Service;

import com.learn.halodoc.entity.Patient;
import com.learn.halodoc.payloads.PatientDtos;

@Service
public interface PatientService {

	Patient createpatient(Patient patient);
}
