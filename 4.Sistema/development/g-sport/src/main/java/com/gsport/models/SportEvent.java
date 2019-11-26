package com.gsport.models;


import java.util.Calendar;


public class SportEvent {

	private String name;
	private Calendar date;
	private String location;
	private String status;

	public SportEvent(String name, Calendar date, String location) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.setStatus("not started");
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}
	

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
