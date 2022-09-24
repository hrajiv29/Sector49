package com.xoriant.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.assignment.entity.VaccinationCenter;


public interface CenterRepository extends JpaRepository<VaccinationCenter, Integer>{
	//public List<VaccinationCenter> findByVaccinationCenter(Integer id);
}
