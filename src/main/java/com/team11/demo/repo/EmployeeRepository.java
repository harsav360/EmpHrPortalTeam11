package com.team11.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team11.demo.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 

}
