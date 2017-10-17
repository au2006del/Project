package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSms {
	
	public static final String ACCOUNT_SID ="ACa49266a70a3af56e47fcc14864334c3b";
	public static final String AUTH_TOKEN ="c96173043eb7864c8eaa676ac4e597be";
	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message1 = Message.creator(
				new PhoneNumber("+15512295671"), 
				new PhoneNumber("+16283003802"), 
				"A restorant Application"
				).create();
		
		Message message2 = Message.creator(
				new PhoneNumber("+15512295673"), 
				new PhoneNumber("+16283003802"), 
				"A restorant Application"
				).create();
		
		Message message3 = Message.creator(
				new PhoneNumber("+14696424185"), 
				new PhoneNumber("+16283003802"), 
				"A restorant Application"
				).create();
		
		Message message4 = Message.creator(
				new PhoneNumber("+15512295671"), 
				new PhoneNumber("+16283003802"), 
				"A restorant Application"
				).create();
	
		System.out.println(message1.getSid());
	}
}
