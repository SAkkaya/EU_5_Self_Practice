package assessment3;

public class Q18 {

	public static void main(String[] args) {
		
		int x=0;
		while(x++<10) {}  //x==>11
		
		if(x>10) {    
			System.out.println("Greater than" + "," + x);  //Greater than,11
			
		} else {
			System.out.println("Not Greater than" + "," + x);
		}
		
	}

}
