package com.epsilon.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Employee {
	private int id;
	private String name;
	private double salary;
	private Gender gender;
	
	public Employee(int id, String name, double salary, Gender gender) throws InvalidIdException, InvalidNameException {
	
		setId(id);
		setName(name);
		setSalary(salary);
		setGender(gender);
	}
	public void setId(int id) throws InvalidIdException {
		if(id<1) {
			throw new InvalidIdException();
		}
		this.id = id;
	}
	public void setName(String name) throws InvalidNameException {
		if(name.trim().length()==0)
			throw new InvalidNameException();
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
