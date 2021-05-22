package day10_controlFlowStatement_Part4;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class C9_task46_MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * Write a program that the user to declare a positive integer. It should then
		 * print the multiplication table of that number.
		 */

		int num = 7;

		System.out.println("Multiplication table for " + num);
		System.out.println("-------------------------------");

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
