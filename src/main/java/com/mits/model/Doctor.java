package com.mits.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer age;
	private String email;
	private String specialization;
	private String gender;
	private String mobileNo;
	private Double fee;
	private Integer experience;
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Patient> patients;
	
	public Doctor() {
		
	}

	public Doctor(String name, Integer age, String email, String specialization, String gender, String mobileNo,
			Double fee, Integer experience, List<Patient> patients) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.specialization = specialization;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.fee = fee;
		this.experience = experience;
		this.patients = patients;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", specialization="
				+ specialization + ", gender=" + gender + ", mobileNo=" + mobileNo + ", fee=" + fee + ", experience="
				+ experience + "]";
	}
}