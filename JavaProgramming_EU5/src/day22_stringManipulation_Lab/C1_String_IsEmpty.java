package day22_stringManipulation_Lab;

public class C1_String_IsEmpty {

	public static void main(String[] args) {   //is not empty means no characters even space is a character
		
		String userName ="";  //Username field can not be empty
		//String userName =" "; //Username is not empty
		String password =""; 
		
		if (userName.isEmpty()) {
			System.out.println("Username field can not be empty");//Username or password can not be empty 
		} else {
			System.out.println("Username is not empty");
		}
		
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty ");
		}else {
			System.out.println("Username or password is not empty ");
		}
		
		
		userName.isBlank();   // blank de space i de true kabul ediyor

	}

}
