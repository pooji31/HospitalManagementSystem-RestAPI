package com.mits.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mits.exception.InvalidDoctorIdException;
import com.mits.model.Doctor;
import com.mits.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepo;
	
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	public List<Doctor> findAll() {
		return doctorRepo.findAll();
	}

	public Doctor findById(Integer id) {
		return doctorRepo.findById(id).orElseThrow(()->new InvalidDoctorIdException("Invalid Id..."));
	}

	public boolean deleteById(Integer id) {
		Optional<Doctor> doc = doctorRepo.findById(id);
		if(doc.isPresent()) {
			doctorRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public Doctor updateDoctor(Integer id, Doctor doctor) {
		findById(id);
		doctor.setId(id);
		doctorRepo.save(doctor);
		return doctor;
	}

	public Doctor partialUpdate(Integer id, Map<String, Object> update) {
		Doctor doctor = findById(id);
		if(update.containsKey("name")) {
			doctor.setName((String)update.get("name"));
		}
		if(update.containsKey("age")) {
			doctor.setAge((Integer)update.get("age"));
		}
		if(update.containsKey("email")) {
			doctor.setEmail((String)update.get("email"));
		}
		if(update.containsKey("specialization")) {
			doctor.setSpecialization((String)update.get("specialization"));
		}
		if(update.containsKey("gender")) {
			doctor.setGender((String)update.get("gender"));
		}
		if(update.containsKey("mobileNo")) {
			doctor.setMobileNo((String)update.get("mobileNo"));
		}
		if(update.containsKey("fee")) {
			doctor.setFee((Double)update.get("fee"));
		}
		if(update.containsKey("experience")) {
			doctor.setExperience((Integer)update.get("experience"));
		}
		doctorRepo.save(doctor);
		return doctor;
	}

	

}
