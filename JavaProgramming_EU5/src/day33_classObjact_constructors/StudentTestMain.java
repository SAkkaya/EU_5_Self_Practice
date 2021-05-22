package day33_classObjact_constructors;

public class StudentTestMain {

	public static void main(String[] args) {
		
		Student s1= new Student("Mike", 17, 'M', 2016, "Java");
		Student s2 =new Student("Smith", 18, 'M', 2015, "JS");
		Student s3 =new Student("Mary", 19, 'F', 2017, "TS");
		
		System.out.println(s1.name + " " + s1.age);
		System.out.println(s1.gender + " " + s1.year + " " + s1.course);
		System.out.println(s1.university);
		
		s1.attendLab();
		s1.attendLecture();
		
		System.out.println(" ----------------------------------------" );
		
		System.out.println(s2.name + " " + s2.age);
		System.out.println(s2.gender + " " + s2.year + " " + s2.course);
		System.out.println(s2.university);
		
		s2.attendLab();
		s2.attendLecture();
		
		System.out.println(" ----------------------------------------" );
		
		System.out.println(s3.name + " " + s3.age);
		System.out.println(s3.gender + " " + s3.year + " " + s3.course);
		System.out.println(s3.university);
		
		s3.attendLab();
		s3.attendLecture();
		

		

	}

}

