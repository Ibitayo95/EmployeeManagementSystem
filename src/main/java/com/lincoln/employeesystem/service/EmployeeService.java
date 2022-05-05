package com.lincoln.employeesystem.service;

import com.lincoln.employeesystem.model.Employee;
import org.springframework.data.domain.Page;


import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    boolean saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize);
}
