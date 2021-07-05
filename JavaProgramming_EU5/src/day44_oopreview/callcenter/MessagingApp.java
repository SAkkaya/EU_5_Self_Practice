package day44_oopreview.callcenter;

public abstract class MessagingApp {
	
	public String name;
	
	protected boolean isFree;
	boolean allOSCompatibel;
	private static int count;
	public static final String APP_Type = "";
	
	MessagingApp(){
		
	}
	
	abstract void sendMessage(String msg);
	
	void launch() {
		
	}
	
	static void close() {
		
	}
	
	

}
