package day20_stringManipulation_part2;

public class C6_Task81_TimeStamp_String_Replace2 {

	public static void main(String[] args) {
		// Write a method that accept the date with time and creates a timeStamp for your automation report.
		
		
		timeStamp("10/10/2019 14:59:00");
	

	}

	public static void timeStamp(String date) {
		
		date="10/10/2019 14:59:00";
		
		date=date.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(date);
		
		
	}

}
