package com.webapps.dockerspringbootsimple.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.webapps.dockerspringbootsimple.service.IMessageService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = { MessageController.class })
public class MessageControllerIT {

	private static final String MESSAGE = "World";
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IMessageService messageService;

	@org.junit.Test
	public void shouldReturnStringContent() throws Exception {

		// Given

		// When
		this.mockMvc.perform(post(URI.create("/message")).contentType(MediaType.TEXT_PLAIN_VALUE).content(MESSAGE)).andDo(print())
				// Then
				.andExpect(status().isOk()).andExpect(content().string(""));
	}
}
