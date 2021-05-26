package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		
//		Student s1 = new Student("Mike", 30, 1000, "Cybertek");

		Student s1 = new Student("Mike", 30, 1000);
		Student s2 = new Student("Mike", 20, 1200);
		Student s3 = new Student("Mike", 10, 1500);
		
		s1.school= "CybertekEU"; // in class level
		
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

//		Student [name=Mike, age=30, idNumber=1000, school=CybertekEU]
//		Student [name=Mike, age=20, idNumber=1200, school=CybertekEU]
//		Student [name=Mike, age=10, idNumber=1500, school=CybertekEU]
		

	}

}
