package com.acsia.acsiawelcomeapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acsia.acsiawelcomeapp.Response.WelComeResponse;


public class WelcomeController {
	@GetMapping("/welcome")
	public WelComeResponse welcome()
	{
		WelComeResponse welcomeresponse = new WelComeResponse("Welcome","Jo");
		return welcomeresponse;
	}

}
