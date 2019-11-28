package com.gsport.app.models;

public class SportEventModality {
	private String modalityName;
	private String modalityDescription;
	
	public SportEventModality(String modalityName, String modalityDescription) {
		super();
		this.modalityName = modalityName;
		this.modalityDescription = modalityDescription;
	}
	public String getModalityName() {
		return modalityName;
	}
	public void setModalityName(String modalityName) {
		this.modalityName = modalityName;
	}
	public String getModalityDescription() {
		return modalityDescription;
	}
	public void setModalityDescription(String modalityDescription) {
		this.modalityDescription = modalityDescription;
	}
	
	
}
