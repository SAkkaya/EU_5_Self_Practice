package week9;

public class Accounts {

	public static void main(String[] args) {
		
		Credentials facebook = new Credentials();
		
		//facebook.username="123"; // everybody can see it because it public
		//facebook.password="9876";
		
		facebook.setUsername("123");
		System.out.println(facebook.getUsername());
		
		Credentials google = new Credentials();
		google.setUsername("cybertekschool@yahoo.com"); //@google.com olmali
		System.out.println(google.getUsername());
		
		
		google.setPassword("a876");
		System.out.println(google.getPassword());
		
		
	}

}
