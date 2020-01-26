package com.webapps.dockerspringbootsimple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${spring.application.name}")
	private String instanceName;

	@GetMapping("/")
	public String hello() {
		if (instanceName == null || instanceName.length() == 0)
			throw new RuntimeException("spring.application.name property is empty."
					+ "Please rerun the application with the " + "option --spring.application.name=<applicationName>");
		return "Response from " + instanceName + " at " + System.currentTimeMillis();
	}
}
