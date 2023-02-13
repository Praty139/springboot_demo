package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao;
	
	public String addUser(){
		EmployeeEntity employee = new EmployeeEntity(2222, "pratyush", 1234);
		dao.save(employee);
		return "Record Saved";
	}

}
