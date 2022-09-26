package com.maven.dao;

//employee dao
public interface EmployeeDao {
	
	//save new employee detail
	public void addEmployee();
	
	//fetch existing employee detail
	public void fetchEmployee();
	
	//changing existing employee detail
	public void updateEmployee();
	
	//remove existing employee detail
	public void deleteEmployee();
}