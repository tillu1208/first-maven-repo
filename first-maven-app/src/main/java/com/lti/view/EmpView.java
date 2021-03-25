package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		//Employee emp= new Employee();
		
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("Mark");
		System.out.println("Id:"+emp.getEmpId());
		System.out.println("Name:"+emp.getEmpName());
	}

}
