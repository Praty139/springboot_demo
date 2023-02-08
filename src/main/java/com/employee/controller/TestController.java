package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.EmployeeServiceImpl;


@RestController
public class TestController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/test")
	public String test() {
		return "abcd";
	}
	@GetMapping("/add")
	public String addUser() {
		String message = employeeServiceImpl.addUser();
		return message;
	}
}