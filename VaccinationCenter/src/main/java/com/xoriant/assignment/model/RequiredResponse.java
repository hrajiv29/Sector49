package com.xoriant.assignment.model;

import java.util.List;

import com.xoriant.assignment.entity.Citizen;
import com.xoriant.assignment.entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RequiredResponse {
	private VaccinationCenter vaccinationCenter;
	private List<Citizen> citizens;

	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}

	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}

	public List<Citizen> getCitizens() {
		return citizens;
	}

	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}

}
