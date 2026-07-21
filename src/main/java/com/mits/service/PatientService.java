package com.mits.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mits.exception.InvalidPatientIdException;
import com.mits.model.Patient;
import com.mits.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepo;

	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	public List<Patient> findAll() {
		return patientRepo.findAll();
	}

	public Patient findById(Integer id) {
		return patientRepo.findById(id).orElseThrow(()->new InvalidPatientIdException("Invalid Patient Id..."));
	}

	
//	public boolean deleteById(Integer id) {
//		Optional<Patient> pat = patientRepo.findById(id);
//		if(pat.isPresent()) {
//			patientRepo.deleteById(id);
//			return true;
//		}
//		return false;
//	}
	
	public void deleteById(Integer id) {
		findById(id);
		patientRepo.deleteById(id);
	}

	public Patient updatePatient(Integer id, Patient patient) {
		findById(id);
		patient.setId(id);
		patientRepo.save(patient);
		return patient;
	}

	public Patient partialUpdate(Integer id, Map<String, Object> update) {
		Patient patient = findById(id);
		if(update.containsKey("name")) {
			patient.setName((String)update.get("name"));
		}
		if(update.containsKey("gender")) {
			patient.setGender((String)update.get("gender"));
		}
		if(update.containsKey("disease")) {
			patient.setDisease((String)update.get("disease"));
		}
		if(update.containsKey("age")) {
			patient.setAge((Integer)update.get("age"));
		}
		if(update.containsKey("weight")) {
			patient.setWeight((Double)update.get("weight"));
		}
		patientRepo.save(patient);
		return patient;
	}
	
	
}
