package com.gsport.app.models;

public class Organizer extends User {
	private String playersList;
	
	public Organizer(String name, String email, String password, String phone, String playersList) {
		super(name, email, password, phone);
		this.playersList = playersList;
	}

	public String getPlayersList() {
		return playersList;
	}

	public void setPlayersList(String playersList) {
		this.playersList = playersList;
	}
	
	
	
	

	
}
