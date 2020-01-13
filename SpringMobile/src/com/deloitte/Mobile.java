package com.deloitte;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Component;

@Component("mobile")

public class Mobile {

	@Autowired

	@Qualifier("airtel")

	Sim sim;

	public void call() {

		sim.call();

	}

	public void browse() {

		sim.browse();
	}

	public void sendSms() {

		sim.sendSms();
	}

	public void sendMms() {

		sim.sendMms();

	}
}