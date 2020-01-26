package com.webapps.dockerspringbootsimple.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class MessageService implements IMessageService {

	@Override
	public String sayHello(String message) {
		Assert.hasText(message, "message must not be empty");;
		return message;
	}

}
