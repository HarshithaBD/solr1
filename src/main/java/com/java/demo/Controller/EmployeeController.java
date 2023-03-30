package com.java.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.demo.Model.Employee;
import com.java.demo.Repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	
	@PostConstruct
	public void addEmployees() 
	{
		List<Employee> employees=new ArrayList<>();
	employees.add(new Employee(373,"harshi",new String[]{"banglore" ,"btm"}));
	employees.add(new Employee(383,"rarshi",new String[]{"banglore" ,"hsr"}));
	repository.saveAll(employees);
	}
@GetMapping("/getAll")
public Iterable<Employee> getEmployees(){
	return repository.findAll();
}

public Employee getEmployeeByName(@PathVariable  String name) {
	return repository.findbyName(name);
}
}
