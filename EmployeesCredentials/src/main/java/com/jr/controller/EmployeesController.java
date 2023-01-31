package com.jr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author venkatesh
 * @return
 *
 */

import com.jr.model.EmployeesModel;
import com.jr.service.EmployeesService;

@RestController
public class EmployeesController {

	@Autowired

	public EmployeesService employeesService;

	/**
	 * the method used for inserting employee records
	 * 
	 * @author venkatesh
	 * @return
	 */
	@PostMapping("/records")
	public String insertRecord(@RequestBody EmployeesModel employeesModel) {

		employeesService.insertData(employeesModel);
		return "Employee Record inserted";
	}

}
