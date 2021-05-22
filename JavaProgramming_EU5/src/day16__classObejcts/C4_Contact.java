package day16__classObejcts;

public class C4_Contact {

	String name;
	String phoneNumber;
	String email;

	public void call() {
		System.out.println("Calling " + name + " ....");
	}

	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber + " | name: " + name);
	}

	public void sendEmail() {
		System.out.println("Sending email to " + email + " ....");
	}

}
