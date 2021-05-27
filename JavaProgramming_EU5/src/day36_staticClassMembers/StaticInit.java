package day36_staticClassMembers;

public class StaticInit {
	
	static final int NUM_SECONDS_PER_HOURS;   // hata verdi final da deger atamadigim icin
	
	static {
		System.out.println("Static init");
		int numSecondPerMinute=60;
		int numMinutePerHour =60;
		NUM_SECONDS_PER_HOURS=numMinutePerHour*numSecondPerMinute; //static method run only one time ve hata gitti atama yaptikdan sonra
	}
	
	private static int one; // bir kez assign ettim complain etmiyor
	private static final int  two; // bir kez assign ettim complain etmiyor
	private static final int three=3; // Re-assign ettim static blokda complain ediyor 
	private static final int four;
	
	static { // static blok runs only one time, so you can assign final value in static
		one=1;// bir kez assign ettim complain etmiyor
		two=2; // bir kez assign ettim complain etmiyor
//		three=4; // Re-assign ettim static blokda complain ediyor 
//		two=4; // Re-assign ettim two yu burda comlain ediyor
	}
	
	

}
