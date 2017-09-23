package com.cristian.springExample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cristian.springExample.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	public List<EmployeeVO> getAllEmployees() {
		ArrayList<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO v1 = new EmployeeVO();
		v1.setFirstName("Pepito");
        v1.setLastName("Perez");
        employees.add(v1);
        
        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Pepito");
        vo2.setLastName("Perez");
        employees.add(vo2);
        return employees;
	}

}
