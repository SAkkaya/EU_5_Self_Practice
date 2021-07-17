package day44_oopreview.callcenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{

	@Override
	public void videoCAll() { 
		System.out.println("WhatsApp - doing a video call Mr Mike...");
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling _ "+ contact +  "  ... ");
	}

	@Override
	public void sendMessage(String msg) {
		
		System.out.println("WhatsApp - sending a message  - " + msg + "...");
	}
	
	
	

}
