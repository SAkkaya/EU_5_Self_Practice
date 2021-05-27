package day36_staticClassMembers;

import static java.lang.Math.*; //import all static properties belongs to Math class 

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16)); //4.0
		
		System.out.println(sqrt(16));// 4.0  Math yazmaya gerek kalmadi yukarda static import ettigimiz icin
		
		System.out.println(PI); //3.141592653589793   ==> directly kullanablirsin yukarda import ettigimiz icin

		System.out.println(sqrt(14.5)); //3.8078865529319543
		
		
	}

}
