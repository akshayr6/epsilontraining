package com.epsilon.programs;

import com.epsilon.entity.Employee;
import com.epsilon.entity.Gender;
import com.epsilon.util.KeyboardUtil;

public class CreateEmployees {

	public static void main(String[] args) throws Exception {
		Employee e1 = new Employee();
		int id = KeyboardUtil.getInteger("Enter id");
		e1.setId(id);
		String gender = KeyboardUtil.getString("Enter gender");
		e1.setGender(Gender.MALE);
		e1.setName("akshay");
		e1.setSalary(10000088);
		

		System.out.println(e1);
	}

}
