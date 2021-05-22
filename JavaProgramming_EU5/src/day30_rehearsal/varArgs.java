package day30_rehearsal;

public class varArgs {

	public static void main(String[] args) {
		
		
		
		sum(2,4);
		sum(2,3,4,5);
		sum(5,10,50);
		
	//	concat("Apple", "Orange", "123", "Result");  //pa3s
		
		System.out.println(concat("Apple", "Orange", "123", "Result"));  //return ile   //pa3s
		

	}
	
	
//	public static void sum(int n1, int n2) {
//		System.out.println(n1+n2);
//	}
	
	
	public static void sum(int...numbers) {  //arays e ceviriyor
		
	//System.out.println(n1+n2);
		
		int sum=0;
		for (int value : numbers) {
			sum=sum+ value;
			
		}
		
		System.out.println(sum); 	 //6
									//16
									//65
		
}
	
			//public static void concat(String...strs) {
	
	public static String concat(String...strs) {  //return ile
		
		String newStr = "";
		for ( String str : strs) {
			
			newStr =newStr + str.charAt(2);
		}
		
		//System.out.println(newStr); //pa3s
		
		return newStr;
	}

}












