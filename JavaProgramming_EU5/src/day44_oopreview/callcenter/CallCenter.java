package day44_oopreview.callcenter;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa= new WhatsApp(); //MessagingApp no-args constructor...
		
		wa.launch(); //MessagingApp is closing...
		wa.allOSCompatible=true;
		wa.isFree=true;
		wa.name="Whats App";
		wa.call("Ozzzy"); //WhatsApp - calling _ Ozzzy  ... 
		wa.sendMessage("Thank you..."); //WhatsApp - sending a message  - Thank you......
		wa.videoCAll(); //WhatsApp - doing a video call Mr Mike...
		wa.accept(); //Mike  finally accepted voice call...
		
		// decliene() static oldugu icin interface adi ile cagirabiliriz
		VoiceCallable.decline(); // Mike declined voice call..
		System.out.println(VoiceCallable.CAN_CALL); //true

		//static variable ; we can call it by class Name
		System.out.println(MessagingApp.APP_Type); //Messenger
		
		System.out.println(wa.getCount()); //0
		wa.setCount(4);
		System.out.println(wa.getCount()); //4
		
		
		System.out.println("-----------------------------");
		
		VoiceCallable obj = new WhatsApp(); //MessagingApp no-args constructor...
		
		
		((MessagingApp) obj).launch(); //CASTING ==> WhatsApp extending the MessagingApp
		//MessagingApp is closing...
		((WhatsApp) obj).launch();  // ((MessagingApp) obj).launch();  yerine bunu desemde olur WjatsApp access to MessagingApp also
		//MessagingApp is closing...
		
		
		((MessagingApp)obj).allOSCompatible = false;
		
		obj.call("Mr. Tom"); //WhatsApp - calling _ Mr. Tom  ..
		
		((WhatsApp)obj).videoCAll(); //((MessagingApp)obj).videoCAll(); olmz cunku VideoCall methodu WhatsApp icinde o da VideoCallable Interfce ini icindekini override ediyor 
		//WhatsApp - doing a video call Mr Mike...
		((VideoCallable)obj).videoCAll();      // interface ide casting edersen ayni
		//WhatsApp - doing a video call Mr Mike...
		
		
		
		
	}

}
