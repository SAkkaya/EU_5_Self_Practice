package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		
		obj.num=5;
		obj.print();//5
		
		
		StaticSuper.num =10;  // static variable oldugu icin num Class ismi ile direct cagirabilirsin
		obj.print(); //10
		
		System.out.println(StaticSub.num); // 10   class adiile direk yazdirabilirsin static oldugu icin

		//StaticSub.m2(); // cagiramazsin static method degil m2 non static
		
		obj.m2(); // inherited oldugu icin bu sekilde cagirabiliriz //StaticSuper.m2() called
		
		
		
		
	}

}
