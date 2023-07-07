package com.learn.halodoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.halodoc.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
