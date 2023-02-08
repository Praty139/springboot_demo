package com.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.EmployeeEntity;


public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer>{

}
