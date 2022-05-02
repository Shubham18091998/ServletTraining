package com.cts.dto;

public class Employee {
	private int empno;
	private String name;
	private int salary;
	private String email;
	private String city;
	private int deptno;

	public Employee() {
		super();
	}

	public Employee(int empno, String name, int salary, String email, String city, int deptno) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.city = city;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String toString() {
		
		return " "+empno+" "+name+" "+salary+" "+email+" "+city+" "+deptno;
		
	}
	
    public void display() {
    	System.out.println(" "+empno+" "+name+" "+salary+" "+email+" "+city+" "+deptno);
    }
}
