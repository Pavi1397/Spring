package com.deloitte;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component("ms")

public class MessageSender {

	@Value("${ms.smsCharge}")

	private float smsCharge;

	@Value("${ms.mmsCharge}")

	private float mmsCharge;

	public float getSmsCharge() {

		return smsCharge;

	}

	public void setSmsCharge(float smsCharge) {

		this.smsCharge = smsCharge;

	}

	public float getMmsCharge() {

		return mmsCharge;

	}

	public void setMmsCharge(float mmsCharge) {

		this.mmsCharge = mmsCharge;

	}

	public void sendSms() {

		System.out.println("SMS Sent...Charged = "+smsCharge);;

	}

	public void sendMms() {

		System.out.println("MMS Sent...Charged = "+mmsCharge);;

	}

}