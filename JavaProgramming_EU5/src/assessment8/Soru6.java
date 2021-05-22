package assessment8;

public class Soru6 {

	public static void main(String[] args) {
		
		
		System.out.println(" "+5=="5");//false
		
		String s1="abc";
		String s2="abc";
		String s3=new  String("abc");
	
		
		System.out.println("s1==s2 is:" + s1 ==s2);//false
		
		System.out.println("s1==s2 is:" + (s1 ==s2));//s1==s2 is:true
		
		System.out.println("s1==s3 is:" + (s1 ==s3));//s1==s3 is:false
		
		System.out.println("s1.equals(s3) is:" + (s1.equals(s3)));//s1.equals(s3) is:true
		
		System.out.println("s1==s2 is:" + s1.equals(s2));//s1.equals(s3) is:true
		
		
	}

}
