package day20_stringManipulation_part2;

public class C6_Task81_TimeStamp_String_Replace {

	public static void main(String[] args) {
		// Write a method that accept the date with time and creates a timeStamp for your automation report.
		
		
		String time="10/10/2019 14:59:00";
		
		System.out.println(timeStamp(time));
	

	}

	public static String timeStamp(String time) {
		
		time=time.replace("/", "").replace(" ", "").replace(":", "");
		
		return time;
		
	}

}
