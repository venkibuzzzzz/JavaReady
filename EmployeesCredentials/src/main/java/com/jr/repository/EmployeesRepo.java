package com.jr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jr.model.EmployeesModel;

@Repository
public interface EmployeesRepo extends JpaRepository<EmployeesModel, Long> {

}
