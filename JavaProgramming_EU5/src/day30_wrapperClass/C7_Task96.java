package day30_wrapperClass;

import java.util.Arrays;

public class C7_Task96 {

	public static void main(String[] args) {
	
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		String[] arr=str1.split("and ");
		System.out.println(Arrays.toString(arr)); //[Today weather is sunny , 72 degree. It is a perfect day to practice java.]
		
		arr=arr[1].split(" degree"); 
		System.out.println(Arrays.toString(arr)); //[72, . It is a perfect day to practice java.]

		String degree=arr[0];
		System.out.println(degree); //72 ==> String
		
		double degreeF=Double.parseDouble(degree);
		double degreeC=(degreeF-32) *5/9;
		
		System.out.println(degreeF + "degree is equal to " + degreeC + " celcius"); //72.0degree is equal to 22.22222222222222 celcius
		System.out.println(degreeF + "degree is equal to " + Math.round(degreeC) + " celcius"); //72.0degree is equal to 22 celcius
		

		
		
	}

}


//Write a program to output: 72 degree is equal to 22.22 celcius.