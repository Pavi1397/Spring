package com.deloitte;

	import java.util.Scanner;

	import org.springframework.context.ApplicationContext;

	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Person {

	public static void main(String[] args) {

			Scanner in=new Scanner(System.in);

			ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

			Mobile m=context.getBean("mobile",Mobile.class);
			m.browse();

			m.call();

			m.sendSms();

			m.sendMms();

		}

	}

