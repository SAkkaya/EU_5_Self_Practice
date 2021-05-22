package day30_rehearsal;

import java.util.Arrays;

public class Task96 {

	public static void main(String[] args) {

		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		String str2 = "Today weather is hot and 105 degree. It is a perfect day to practice java.";
		
		degreeToCel(str1);
		degreeToCel(str2);

		
	}
	
	
	public static void degreeToCel( String str) {
		
		
		String [] arr = new String [2];
		
		arr = str.split("and ");
		System.out.println(Arrays.toString(arr)); //[Today weather is sunny , 72 degree. It is a perfect day to practice java.]
		
		
		arr=arr[1].trim().split(" ");
		
		System.out.println(Arrays.toString(arr)); //[72, degree., It, is, a, perfect, day, to, practice, java.]
		
		String degree= arr[0];
		System.out.println(degree);
		
		int deg=Integer.parseInt(arr[0]);
		System.out.println(deg);
		
		
		double celcius=(deg-32)/1.8;   //°F = °C * 1,8 + 32 (von Celsius nach Fahrenheit)
		
		System.out.println(deg + " degree is equal to " + Math.round(celcius) + " celcius");
	
		
		
	}
	

}
