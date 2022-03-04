package com.examples.employees.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.employees.model.Employees;

@Repository
@Transactional
public interface EmployeeRepo extends JpaRepository<Employees,Integer> {

}