package com.suresnes.opendata.dto;

public class Rue {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String rue;
	private int startNumber;
	private int endNumber;
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}
	public int getEndNumber() {
		return endNumber;
	}
	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}
	
	
}
