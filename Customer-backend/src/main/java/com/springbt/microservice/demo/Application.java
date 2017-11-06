package com.springbt.microservice.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*SpringApplication application = new SpringApplication(Application.class);
        application.setWebEnvironment(false);
        application.setBannerMode(Banner);
        application.run(args);*/
	}

}
