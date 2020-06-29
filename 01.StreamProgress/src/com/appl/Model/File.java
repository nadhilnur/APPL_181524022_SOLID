package com.appl.Model;

import com.appl.Interface.IStreamable;

public class File implements IStreamable {

	private String name;
	private int length;
	private int bytesSent;
	public File(String name, int length, int bytesSent){
		this.name = name;
		this.setLength(length);
		this.setBytesSent(bytesSent);
	}
	
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.length;
	}

	@Override
	public int getBytesSent() {
		// TODO Auto-generated method stub
		return this.bytesSent;
	}
	
	private void setLength(int length) {
		this.length = length;
	}
	
	private void setBytesSent(int bytesSent) {
		this.bytesSent = bytesSent;
	}

	
}
