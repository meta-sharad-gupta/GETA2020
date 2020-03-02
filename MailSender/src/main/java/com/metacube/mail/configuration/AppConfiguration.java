package com.metacube.mail.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.metacube.mail.mailSender.MockMailSender;
import com.metacube.mail.mailSender.SmtpMailSender;

//Use the AppConfig file when we don't use component annotation
//use bean annotation on method which we want to invoke

@Configuration
public class AppConfiguration {

	@Bean
	public SmtpMailSender smtpMailSender() {
		return new SmtpMailSender();
	}
	
	 
	public MockMailSender mockMailSender() {
		return new MockMailSender();
	}
}