package com.gsport.app.models;

public class ContestChart {
	private int qtdContests;
	private int qtdTeams;
	public ContestChart(int qtdContests, int qtdTeams) {
		super();
		this.qtdContests = qtdContests;
		this.qtdTeams = qtdTeams;
	}
	public int getQtdContests() {
		return qtdContests;
	}
	public void setQtdContests(int qtdContests) {
		this.qtdContests = qtdContests;
	}
	public int getQtdTeams() {
		return qtdTeams;
	}
	public void setQtdTeams(int qtdTeams) {
		this.qtdTeams = qtdTeams;
	}
	
	
	
	
}
