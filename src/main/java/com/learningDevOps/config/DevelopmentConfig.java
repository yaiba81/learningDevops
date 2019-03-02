package com.learningDevOps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.learningDevOps.backend.service.EmailService;
import com.learningDevOps.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("File:///${user.home}/.learningDevOps/application-dev.properties")
public class DevelopmentConfig {
	
	@Bean
	public EmailService emilService() {
		return new MockEmailService();
	}

}
