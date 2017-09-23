package com.cristian.springExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cristian.springExample.manager.EmployeeManager;

@Controller
//@RequestMapping("/employee-module")
public class EmployeeControllerTh {
	@Autowired
	 EmployeeManager manager;
	 
	 	 
	 @RequestMapping(value = "/employee-module/getAllEmployeesTh", method = RequestMethod.GET)
	 public String getAllEmployees2(Model model)
	 {
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplayTh";
	 }
}
