package week9;

public class Credentials {
	
	//public String username, password;
	private String username, password;
	
	public String getUsername() {
		return username;
	}
	
	// setter ve getter ile biz restriction veriyoruz 
	public void setUsername(String username) {
		if(username.length()<8) {
			System.err.println("username should at least be  8 characters");
			return; // exit method // if username is provided less than 8 characters this method will not be executed
		
		}
		
		if (!username.endsWith("@gmail.com")){
			System.out.println("username must end with @gmail.com");
			return;
		}
		
		this.username=username;
	}

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(!Character.isLetter(password.charAt(0))) {
			System.err.println("password must start with a letter");
		return;
		}
		this.password = password;
	}
	
	
	
	
	

}
