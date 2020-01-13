package com.deloitte;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("jio")

public class JioSim implements Sim {

	@Value("${jio.callCharge}")

	private float callCharge;

	@Value("${jio.speed}")

	private float speed;

	@Autowired

	@Qualifier("ms")

	private MessageSender ms;

	public void sendSms() {

		ms.sendSms();

		System.out.println("From Airtel");

	}

	public void sendMms() {

		ms.sendMms();

		System.out.println("From Airtel");

	}


	public float getCallCharge() {

		return callCharge;

	}

	public void setCallCharge(float callCharge) {

		this.callCharge = callCharge;

	}

	public float getSpeed() {

		return speed;

	}

	public void setSpeed(float speed) {

		this.speed = speed;

	}

	@Override

	public void browse() {

		System.out.println("Browing with Jio...Speed "+speed+" mb/s");

	}

	@Override

	public void call() {

		System.out.println("Calling with Jio...Charges "+callCharge+" /min");


	}

}