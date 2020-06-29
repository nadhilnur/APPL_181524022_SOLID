package com.appl.Model;

import com.appl.Interface.IStreamable;

public class Music implements IStreamable {

	private String artist;
	private String album;
	private int length;
	private int bytesSent;
	
	public Music(String artist, String album, int length, int bytesSent) {
		this.artist = artist;
		this.album = album;
		this.length = length;
		this.bytesSent = bytesSent;
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
