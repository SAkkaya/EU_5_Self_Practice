package short_videos;

public class C1_ {

	public static void main(String[] args) {
		
		callC();

	}
	
	
	public static void callA() {
		System.out.println("method A call started");
		callB();
		System.out.println("method A call ended");
	}


	public static void callB() {
		System.out.println("method B call started");
		callC();
		System.out.println("method B call ended");
	}


	public static void callC() {
		System.out.println("method C call started");
		System.out.println("method C call ended");
	}

}
