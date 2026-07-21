package com.mits.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mits.model.Doctor;
import com.mits.model.Patient;
import com.mits.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping("/save")
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient){
		Patient savedPatient = patientService.savePatient(patient);
		return new ResponseEntity<Patient>(HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Patient>> fetchPatient(){
		List<Patient> pat = patientService.findAll(); 
		return new ResponseEntity<List<Patient>>(pat, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<?> fetchPatientById(@PathVariable Integer id){
	    Patient pat = patientService.findById(id);
		return new ResponseEntity<Patient>(pat, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updatePatientById(@PathVariable Integer id,@RequestBody Patient patient){
//		 Patient oldPatient = patientService.findById(id);
//		 oldPatient.setName(patient.getName());
//		 oldPatient.setGender(patient.getGender());
//		 oldPatient.setDisease(patient.getDisease());
//		 oldPatient.setAge(patient.getAge());
//		 oldPatient.setWeight(patient.getWeight());
		 Patient updatedPatient = patientService.updatePatient(id, patient);
		 return new ResponseEntity<Patient>(updatedPatient, HttpStatus.CREATED);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePatientById(@PathVariable Integer id){
		patientService.deleteById(id);
		return new ResponseEntity<String>("Please Enter Valid Id...", HttpStatus.OK);
	}
	
	@PatchMapping("/patch/{id}")
	public ResponseEntity<Patient> updatePatientPartially(@PathVariable Integer id, @RequestBody Map<String, Object> update){
		Patient updatedPat = patientService.partialUpdate(id, update);
		return new ResponseEntity<Patient>(updatedPat, HttpStatus.OK);
		
	}
}
