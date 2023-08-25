package com.NeerajChaudhary.InfrastructureStatistic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table
public class testContainer {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)



	private int id;
@Column(name = "emp_name")
	private String name;
@Column
	private float salary;

	
	public testContainer() {
		
	}


	public testContainer(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
