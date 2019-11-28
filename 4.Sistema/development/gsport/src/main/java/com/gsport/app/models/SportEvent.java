package com.gsport.app.models;

import java.sql.Date;

public class SportEvent {
	private String eventName;
	private Date eventDate;
	private String eventLocation;
	private String eventDescription;
	private String eventStatus;
	
	public SportEvent(String eventName, Date date, String location, String description, String status) {
		this.eventName = eventName;
		this.eventDate = date;
		this.eventLocation = location;
		this.eventDescription = description;
		this.eventStatus = status;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}
}
		