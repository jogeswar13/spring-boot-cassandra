package com.rbs.springbootcassandra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rbs.springbootcassandra.bean.EmployeeBean;
import com.rbs.springbootcassandra.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@GetMapping("/findAll")
	public Object getAllEmployee(@RequestParam(required = false) String lang) {
		return employeeService.findAll(lang);
	}

	@PostMapping("/save")
	public Object save(@RequestBody EmployeeBean bean) {
		return employeeService.create(bean);
	}

}
