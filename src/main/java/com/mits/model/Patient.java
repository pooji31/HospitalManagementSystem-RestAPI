package com.mits.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String gender;
	private String disease;
	private Integer age;
	private Double weight;
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	public Patient() {
		
	}

	public Patient(String name, String gender, String disease, Integer age, Double weight, Doctor doctor) {
		super();
		this.name = name;
		this.gender = gender;
		this.disease = disease;
		this.age = age;
		this.weight = weight;
		this.doctor = doctor;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", disease=" + disease + ", age=" + age
				+ ", weight=" + weight + ", doctor=" + doctor + "]";
	}
	
}
