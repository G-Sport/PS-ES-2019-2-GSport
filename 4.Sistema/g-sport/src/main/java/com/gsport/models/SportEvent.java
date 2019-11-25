package com.gsport.models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SportEvent implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id //id para cada entidade Evento na Tabela
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long code;
	
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

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
