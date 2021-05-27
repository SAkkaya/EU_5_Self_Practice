package day36_staticClassMembers;

public class CampusTest {

	public static void main(String[] args) {

		Campus c1 = new Campus("McLean"); // her yeni object yaratttigimda yeni constructor cagiracak
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);
		//System.out.println(Campus.city); private  oldugu icin hata verir
	
	} 

}
