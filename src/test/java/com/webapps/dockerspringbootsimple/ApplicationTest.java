package com.webapps.dockerspringbootsimple;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.webapps.dockerspringbootsimple.service.IMessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private IMessageService helloService;
	
	@Test
	public void contextLoads() {
		Assertions.assertThat(helloService).isNotNull();
	}

}
