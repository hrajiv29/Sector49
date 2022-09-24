package com.xoriant.assignment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int vaccinationCenterId;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVaccinationCenterId() {
		return vaccinationCenterId;
	}

	public void setVaccinationCenterId(int vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}



	@Override
	public String toString() {
		
		String string = "id =" + id + " name = "+name + " vaccinationCenterId ="+vaccinationCenterId;
	return string;
	}
}
