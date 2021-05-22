package assignment10;

import java.util.Scanner;

public class Question16_Benim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string word");
		String str = sc.next();
		sc.close();

//		String str1="javapython";  //true
//		String str2="cjavac++";  //true
//		String str3="c#javaruby";  //false

		System.out.println(isExist(str));

	}

	public static boolean isExist(String str) {
		
		return ((str.substring(0,4).contains("java")) || (str.substring(1,5).contains("java"))); 
			
		
	}
}

/*
 * Given a string word, print true if "java" appears starting at index 0 or 1 in
 * the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
 * string should be 4 and more characters. Sample Output: input: javapython
 * output: true
 * 
 * input: cjavac++ output: true
 * 
 * input: c#javaruby output: false
 */
