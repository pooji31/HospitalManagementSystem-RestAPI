package com.mits.controller;

import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mits.model.Doctor;
import com.mits.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
  
	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/save")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor){
		Doctor savedDoctor = doctorService.saveDoctor(doctor);
		return new ResponseEntity<Doctor>(savedDoctor, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Doctor>> fetchDoctor(){
		List<Doctor> doc = doctorService.findAll(); 
		return new ResponseEntity<List<Doctor>>(doc, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<?> fetchDoctorById(@PathVariable Integer id){
		Doctor doc = doctorService.findById(id);
		return new ResponseEntity<Doctor>(doc, HttpStatus.FOUND);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateDoctorById(@PathVariable Integer id,@RequestBody Doctor doctor){
		Doctor updatedDoctor = doctorService.updateDoctor(id, doctor);
		 return new ResponseEntity<Doctor>(updatedDoctor, HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Doctor> deleteDoctorById(@PathVariable Integer id){
		boolean delDoc = doctorService.deleteById(id);
		return new ResponseEntity<Doctor>(HttpStatus.OK);
	}
	
	@PatchMapping("/patch/{id}")
	public ResponseEntity<Doctor> updateDoctorPartially(@PathVariable Integer id, @RequestBody Map<String, Object> update){
		Doctor updatedDoc = doctorService.partialUpdate(id, update);
		return new ResponseEntity<Doctor>(updatedDoc, HttpStatus.OK);
	}
	
}
