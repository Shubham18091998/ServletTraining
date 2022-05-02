package com.cts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cts.dto.Employee;
import com.cts.util.JdbcConnection;

public class EmployeeDaoImpl implements EmpDao {

	public void insert(Employee emp) {
	
		
	}

	public boolean delete(int empno) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateSalary(int empno, int salary) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Employee> getAllRecords() {
		Connection con = JdbcConnection.getConnection();  
		 ArrayList<Employee>empList= new ArrayList<Employee>();
		 PreparedStatement pst=null;
		 ResultSet rs= null;
		 try {
			 String query="select * from employee";
			pst= con.prepareStatement(query);
			  rs=pst.executeQuery();
			  
			  while(rs.next()) {
				  
				  int m_empno=rs.getInt(1);
				  String m_name=rs.getString(2);
				  int m_salary=rs.getInt(3);
				  String m_email=rs.getString(4);
				  String m_city=rs.getString(5);
				  int m_deptno=rs.getInt(6);
				  Employee emp = new Employee(m_empno, m_name, m_salary, m_email, m_city,m_deptno);
				  empList.add(emp);
			  }
			  
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			try {rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		 
		return empList;
	}

	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
