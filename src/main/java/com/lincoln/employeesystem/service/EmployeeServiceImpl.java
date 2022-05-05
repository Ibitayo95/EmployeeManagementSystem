package com.lincoln.employeesystem.service;

import com.lincoln.employeesystem.model.Employee;
import com.lincoln.employeesystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // adds an employee to the database
    @Override
    public boolean saveEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // retrieves an employee if they exist
    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        Employee foundEmployee = null;
        if (employee.isPresent()) {
            foundEmployee = employee.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return foundEmployee;
    }

    // deletes an employee if they exist
    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.employeeRepository.findAll(pageable);
    }
}
