package day44_oopreview.callcenter;

public abstract class VideoMessagingApp extends MessagingApp implements VideoCallable, ScreenSharable{

	// we dont have any error because it is no concrete class it is abstract class
	
	
	// there is no constructor with no parameter 
	// there is no any constructor in  MessagingApp 
	
	// alttaki default constructor i comment a alirsam hata verir, cunku altinda parametreli constructor var MessagingApp icinde
	
	/*  bu alttaki with no parameter constructor,  default olarak gelir JVM tarafindan, benim yazmama gerek yok
	public MessagingApp(){
		System.out.println("MessagingApp no-args constructor...");
	}

	*/
	
	/*
	public VideoMessagingApp(String name, int count) {
		super(name, count);
		
	}
	*/
	
	
	

}
