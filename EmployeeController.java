package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avi/v1/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable(value="id")int id) {
		return employeeRepository.findById(id).get();
	}
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee emp=employeeRepository.save(employee);
		return emp;
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable(value="id")int id,@RequestBody Employee employee) {
		Employee emp=employeeRepository.findById(id).get();
		emp.setName(employee.getName());
		emp.setCity(employee.getCity());
		return employeeRepository.save(emp);
		
	}
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable(value="id")int id){
		Employee emp=employeeRepository.findById(id).get();
		employeeRepository.delete(emp);
		return"succssfull delete";
	}
	
}
