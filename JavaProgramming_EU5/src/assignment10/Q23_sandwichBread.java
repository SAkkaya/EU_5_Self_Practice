package assignment10;

public class Q23_sandwichBread {

	public static void main(String[] args) {

		String str = "xxbreadjambreadyy";

		int i = str.indexOf("bread");
		int j = str.indexOf("bread", i + 1);
		int k = j - i;

		// if(k==5){
		// System.out.println("nothing");
		if (str.replaceFirst("bread", "").contains("bread")) {
			System.out.println(str.substring(i + 5, j));
		} else {
			System.out.println("nothing");
		}
	}

}

/*A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter*/