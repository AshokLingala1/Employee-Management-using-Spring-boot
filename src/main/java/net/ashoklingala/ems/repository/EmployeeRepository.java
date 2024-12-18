package net.ashoklingala.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ashoklingala.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}