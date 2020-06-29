package com.appl.Model;

import com.appl.Interface.ISleeper;

public class Employee extends Worker implements ISleeper {

	public Employee(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sleep() {
		// TODO Auto-generated method stub
		System.out.println("Worker sleeping");

	}

}
