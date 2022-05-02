package com.cts.dao;

import java.util.ArrayList;

import com.cts.dto.Employee;



public interface EmpDao {
	public void insert(Employee emp); 
	public boolean delete(int empno);
	public boolean updateSalary(int empno,int salary);
	public ArrayList<Employee>getAllRecords();
	public Employee getEmployee(int empno);	
}
