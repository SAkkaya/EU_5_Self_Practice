package day38_inheritance_part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		
	//	dog.eat(); //Animal.eat() is called

	//	dog.name ="ABC"; // ismini dog un degistiremem ancak yeni object yaratmam lazim sadece cagirabilirim ismini
		
		
//		System.out.println(dog.getName()); // Yorkie
//		
//		dog.setName("Karabas");
//		
//		System.out.println(dog.getName()); // Karabas
		
		dog.move(10);
		
		

	}

}
