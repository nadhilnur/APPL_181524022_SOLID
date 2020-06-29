package com.appl.Model;

public class Worker {

	private String id;
	private int workingHours;
	
	public Worker(String id) {
		this.id = id;
	}
	
	public void Work(int hours) {
		this.workingHours += hours;
	}
	
}
