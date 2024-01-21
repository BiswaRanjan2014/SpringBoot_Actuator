package com.dakr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/msg")
	public String greetMsg() {
		return "GoodMorning";
	}
}
