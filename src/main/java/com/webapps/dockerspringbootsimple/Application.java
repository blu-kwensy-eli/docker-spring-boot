package com.webapps.dockerspringbootsimple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
public class Application{
    
    public static void main(String [] args){
        SpringApplication.run(Application.class, args);
    }
    
    @Value("${spring.application.name}")
    private String instanceName;

    @GetMapping("/")
    public String hello(){
        if(instanceName == null || instanceName.length() == 0)
                throw new RuntimeException("spring.application.name property is empty."+
                 "Please rerun the application with the "+
                 "option --spring.application.name=<applicationName>");
        return "Response from " + instanceName + " at " + System.currentTimeMillis();
    }
}