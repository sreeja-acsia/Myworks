package com.acsia.acsiawelcomeapp.Response;

public class WelComeResponse {
	private String message;
	private String name;
	
	
	public WelComeResponse(String message, String name) {
	
		this.message = message;
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
