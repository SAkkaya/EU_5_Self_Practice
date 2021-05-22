package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class C3_CustomMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numsList = new ArrayList <>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);  // This is calling a method which is accepting as a parameter Arraylist , this method name is printList
		
		
		ArrayList<Double>doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList (doubleList);
		//sum=sum*4;
		System.out.println("sum : " + sum); //sum : 27.200000000000003
		System.out.println("sum : " + Math.round(sum)); //sum : 27
		
		
		ArrayList<Integer> list = getList(15); //1,2,3, .....15
		System.out.println(list.toString()); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]		
		System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]  aynisi

		ArrayList<Integer>rList= getRandomList(20);
		System.out.println(rList.toString());  //[45, 25, 24, 86, 8, 14, 96, 89, 3, 54, 67, 50, 91, 95, 14, 11, 83, 36, 64, 47, 37]
		
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		System.out.println(strnums); //[123, 33, 12]  ==> String 
		
		ArrayList <Integer> converted = convertToIntList(strnums);
		System.out.println(converted); //[123, 33, 12] ==> int a donusturulmus hali

		
	}




	public static void printList(ArrayList<Integer> nums) {
		
		//System.out.println(nums); //[10, 10, 7, 8, 8, 3, 4, 8]
		
		for (Integer n : nums) {
			System.out.print(n+ " "); //10 10 7 8 8 3 4 8 
		}
		System.out.println();
	}
	
	
	
	public static double sumList(ArrayList<Double> dList) {
		
		double sum=0;
		
		for (Double each : dList) {
			sum+=each;
		}
		
		return sum;
		
	}
	
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
	
		
		for (int i = 1; i <= size; i++) {
			newList.add(i);
		}
		
		return newList;
	}

	public static ArrayList<Integer> getRandomList(int size) {
		
		Random r = new Random();
		ArrayList<Integer> randomNums=new ArrayList<>();
		for (int i = 0; i <=size; i++) {
			randomNums.add(r.nextInt(101)); //0 -100 arasi random sayilari olusturuyor
		}
		
		return randomNums;
	}
	
	private static ArrayList<Integer> convertToIntList(ArrayList<String> strList) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (String str : strList) {
			
			newList.add(Integer.parseInt(str));
			
		}
		return newList;
		
	}

	

}
