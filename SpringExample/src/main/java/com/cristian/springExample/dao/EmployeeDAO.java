package com.cristian.springExample.dao;

import java.util.List;

import com.cristian.springExample.model.EmployeeVO;

public interface EmployeeDAO {
	public List<EmployeeVO> getAllEmployees();
}
