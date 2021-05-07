package self_arrays;

import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {

		// getValues();
		double[] dizi = getValues();
		// totalFall(dizi);

		// totalFall(getValues());
		// double sumTotal= totalFall(getValues());
		double sumTotal = totalFall(dizi);

		// average(totalFall(getValues()));
		//average(sumTotal);
		double awg=average(sumTotal);
		
		//maxRainFall(dizi);
		double max = maxRainFall(dizi);
		
		//minRainFall(dizi);
		double min=minRainFall(dizi);

		System.out.println("The sum of all the rain is: " + sumTotal + " inches");
		System.out.println("The avarage rainfall was: " + awg + " inches");
		System.out.println("The max rain is: " + max + " inches");
		System.out.println("The min rain is: " + min + " inches");

	}

	public static double minRainFall(double[] eachMonth) {

//		double min=Double.MAX_VALUE;

//		for (int i = 0; i < eachMonth.length; i++) {
//			if (eachMonth[i]<min) {
//				min=eachMonth[i];
//			} 
//			
//		}
//		return min;

		double min = eachMonth[0];

		for (int i = 0; i < eachMonth.length-1; i++) {
			if (eachMonth[i + 1] < min) {
				min = eachMonth[i + 1];
			}

		}
		return min;

	}

	public static double maxRainFall(double[] eachMonth) {
		// double max=Double.MIN_VALUE;

		double max = 0;

		for (int i = 0; i < eachMonth.length; i++) {
			if (eachMonth[i] > max) {
				max = eachMonth[i];
			}

		}
		return max;

	}


	public static double average(double sumRainfall) {
		
		double awg = sumRainfall /12;

		return awg;

	}

	public static double totalFall(double[] array) {

		double sum = 0;

		for (int j = 0; j < array.length; j++) {

			sum += array[j];

		}

		return sum;

	}

	// public static double[] getValues(double[] array) {
	public static double[] getValues() {

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// double[] array=new double[12];

		double[] array = new double[months.length];

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month RainFall (In inches)");

		for (int i = 0; i < array.length; i++) {

			System.out.print(months[i] + " : ");

			array[i] = scan.nextDouble();

			if (array[i] >= 0) {
				continue;
			} else {
				System.out.println("invalid Month RainFall (In inches) do not enter negative inches");
				i--;
				continue;

			}

		}
		return array;

	}

}
