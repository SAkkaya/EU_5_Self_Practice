package self_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		String[] months1= {"Jan","Feb", "Mar","Apr","May","Jun","Jul","Aug", "Sep", "Oct", "Nov","Dec"};
		//String[] months = new String[12];
		
		System.out.println("Ender index number of the month");
		
		int index = sc.nextInt();
		
		System.out.println(months1[index]);
	
		System.out.println(months1); //[Ljava.lang.String;@3c5a99da
		
		System.out.println(Arrays.toString(months1)); //[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec]
		
		sc.close();
	}

}
