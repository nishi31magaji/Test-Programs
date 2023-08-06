package com.yodlee.test;

public class RecurringEvent {
	private Predicated predicated;

	public Predicated getPredicated() {
		return predicated;
	}

	public void setPredicated(Predicated predicated) {
		this.predicated = predicated;
	}
}

class Predicated {
	private String status;

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}

}