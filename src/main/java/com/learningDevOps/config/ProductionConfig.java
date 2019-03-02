package com.learningDevOps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.learningDevOps.backend.service.EmailService;
import com.learningDevOps.backend.service.SmtpEmailService;

@Configuration
@Profile("prod")
@PropertySource("File:///${user.home}/.learningDevOps/application-prod.properties")
public class ProductionConfig {

	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
