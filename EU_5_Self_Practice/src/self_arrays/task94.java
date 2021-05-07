package self_arrays;

public class task94 {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
				
		
		
		String [] info1Array=info1.split("xxx");
		String [] info2Array=info2.split("xxx");
		
//		for (String each : info1Array) {
//			System.out.println(each);
//		}
		
		String password= info1Array[1]+info2Array[1];
		System.out.println(password);
	}

}



//Create a password based on given info.
//Output: CD132G00ABC!	