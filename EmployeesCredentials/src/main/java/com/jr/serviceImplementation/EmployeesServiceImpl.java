package com.jr.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.model.EmployeesModel;
import com.jr.repository.EmployeesRepo;
import com.jr.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	public EmployeesRepo empRepo;
	
	@Override
	public void insertData(EmployeesModel employeesModel) {
		
		empRepo.save(employeesModel);
	}

}
