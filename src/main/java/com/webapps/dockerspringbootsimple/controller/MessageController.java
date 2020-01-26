package com.webapps.dockerspringbootsimple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapps.dockerspringbootsimple.service.IMessageService;

@RestController
@RequestMapping("/message")
public class MessageController {

	private IMessageService helloService;

	@Autowired
	public MessageController(IMessageService helloService) {
		this.helloService = helloService;
	}

	@PostMapping(consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello(@RequestBody String message) {
		return helloService.sayHello( message);
	}
}
