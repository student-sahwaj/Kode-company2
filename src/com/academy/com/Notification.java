package com.academy.com;

public class Notification {
	public void sendNotiofication(String type) {
		System.out.println("Notification .sendNotification");
		if (type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if (type.equalsIgnoreCase("MAil")){
			sendEmail();
			
		}
	}
	
	private void sendSMS() {
	  System.out.println("Notification.sendSMS() Start");
	  System.out.println("Notification.sendSMS() end");
	}
	private void sendEmail() {
		System.out.println("Notification.sendEmail() Start");
		System.out.println("Notification.sendEmail() end");
	}
	public static void main(String args[]) {
		Notification set = new Notification ();
//		set.sendSMS();
//		set.sendEmail();
		set.sendNotiofication("email");

	}

}
