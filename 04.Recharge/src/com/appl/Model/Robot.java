package com.appl.Model;

import com.appl.Interface.IRechargeable;

public class Robot extends Worker implements IRechargeable {

	private int capicity;
	private int currentPower;
	
	public Robot(String id, int capacity) {
		super(id);
		// TODO Auto-generated constructor stub
		this.capicity = capacity;
	}

	private int getCapicity() {
		return capicity;
	}
	
	public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }	

    public int getCurrentPower() {
        return currentPower;
    }

    @Override
    public void Work(int hours) {
        if (hours > this.currentPower) {
            hours = currentPower;
        }
        super.Work(hours);
        this.currentPower -= hours;
    }
	
	@Override
	public void Recharge() {
		// TODO Auto-generated method stub
		this.currentPower = this.getCapicity();

	}
}
