package day23_stringManipulationLab_randomClasss;

public class Question_15_Benim {

	public static void main(String[] args) {
		
		String str="cabadxx";
	
		
		if((str.substring(0, 3)).equalsIgnoreCase("bad") || str.substring(1, 4).equalsIgnoreCase("bad")){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}


/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false*/