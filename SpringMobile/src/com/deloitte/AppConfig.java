package com.deloitte;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.PropertySource;

@Configuration

@ComponentScan("com.deloitte")

@PropertySource("app.properties")

public class AppConfig {

	@Bean("alternateMS")

	public MessageSender getMsBean() {

		MessageSender ms=new MessageSender();

		ms.setMmsCharge(5.2f);

		ms.setSmsCharge(2.5f);

		return ms;

	}
}
