package day38_inheritance_part2;

public class SubClass1 extends SuperClass1{

	public SubClass1() {  // constructor chaining baska costructoor i bu constructor icinden invoke etmek
		this(5); // alttaki tek parametirli constructor i this () ile cagiriyoruz  
		System.out.println("This is the subclass constructor1");
		
	}
	
	public SubClass1(int s) {  // this()  ve super() ayni constructor da yer alamaz ayri consructor olusturmak lazim 
		
		//super();// JVM _ bu default no parameter parent constructor i automatik java yaratiyor arka planda aslinda yazmasakda kendimiz
	//super(6); // ust sinifa git yani SuperClass1 a git
		System.out.println("This is the subclass constructor2");
		
	}

	public SubClass1(String  sub) {
		//default Super(); geliyor once superclass in no parameter constructor ina gidecek extends ettigimiz icin 
		System.out.println(sub);
		
		
	}

}
