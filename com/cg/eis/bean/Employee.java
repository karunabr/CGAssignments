package com.cg.eis.bean;

public class Employee {
	
	int id; 
	String name;
	double salary;
	String desg;
	String insurance;
	
	Employee(){}
	
	Employee(int id,String name, double salary, String desg, String i)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.desg=desg;
		this.insurance=i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	

}
