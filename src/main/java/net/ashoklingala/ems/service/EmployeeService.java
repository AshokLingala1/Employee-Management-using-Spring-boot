package net.ashoklingala.ems.service;

import net.ashoklingala.ems.dto.EmployeeDto;
import net.ashoklingala.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
