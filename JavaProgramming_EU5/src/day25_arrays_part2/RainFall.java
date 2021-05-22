package day25_arrays_part2;

import java.util.Scanner;

public class RainFall {
	public final String[] month = { "Januray", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	
	public double[] monthfall = new double[12];
	
	public void setMonthRainFall() {
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month RainFall (In inches)");

		// String [] month=new String[12];
		// monthfall = new double[12];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < month.length; i++) {
			System.out.print(month[i] + ": ");
			monthfall[i] = scan.nextDouble();
			if (monthfall[i] >= 0) {
				continue;

			} else {

				System.out.println("invalid Month RainFall (In inches) do not enter negative inches");
				i--;
				continue;

			}

		}

		scan.close();

	}
	
	

	public double totalRainFall() {
		double sum = 0;
		for (int i = 0; i < monthfall.length; i++) {
			sum += monthfall[i];

		}
		return sum;

	}

	public double avgMonthFall() {
		double awg = totalRainFall() / monthfall.length;
		return awg;
	}

	public double maxRainFall() {
		double max = Double.MIN_VALUE;
		// double max =0;
		for (int i = 0; i < month.length; i++) {
			if (monthfall[i] > max) {
				max = monthfall[i];
			}

		}
		return max;

	}

	public double minRainFall() {
		double min = Double.MAX_VALUE;
		// double min =0;
		for (int i = 0; i < month.length; i++) {
			if (monthfall[i] < min) {
				min = monthfall[i];
			}

		}
		return min;
	}



	public void print() {
		System.out.println("The sum of all the rain is: " + totalRainFall() + " inches");
		System.out.println("The avarage rainfall was: " + avgMonthFall() + " inches");
		System.out.println("The max rain is: " + maxRainFall() + " inches");
		System.out.println("The min rain is: " + minRainFall() + " inches");

	}
}