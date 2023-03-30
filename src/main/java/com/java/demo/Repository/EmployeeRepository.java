package com.java.demo.Repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import com.java.demo.Model.Employee;
@Repository
public interface EmployeeRepository extends  SolrCrudRepository<Employee,Integer>{

	Employee findbyName(String name);

}
