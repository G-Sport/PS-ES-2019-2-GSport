package com.gsport.app.models;

public class Contest {
	private String contestTime;
	private String contestLocal;
	private String contestStatus;
	public Contest(String contestTime, String contestLocal, String contestStatus) {
		super();
		this.contestTime = contestTime;
		this.contestLocal = contestLocal;
		this.contestStatus = contestStatus;
	}
	public String getContestTime() {
		return contestTime;
	}
	public void setContestTime(String contestTime) {
		this.contestTime = contestTime;
	}
	public String getContestLocal() {
		return contestLocal;
	}
	public void setContestLocal(String contestLocal) {
		this.contestLocal = contestLocal;
	}
	public String getContestStatus() {
		return contestStatus;
	}
	public void setContestStatus(String contestStatus) {
		this.contestStatus = contestStatus;
	}
	
	
}
