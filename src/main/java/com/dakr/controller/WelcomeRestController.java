package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class WelcomeRestController {

	@GetMapping("/name")
	public String WelcomeMsg() {
		return "WelKom Biswa Ranjan Behera";
	}
}
