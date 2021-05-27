package day36_staticClassMembers;

public class AllBlocks {

	public AllBlocks(int x) {
		System.out.println("One argument constructor");
	}

	public AllBlocks() {
		System.out.println("No argument constructor");
	}

	static {  // run first static only one time 
		System.out.println("First static init");
	}

	{  // initialisation bloc runs each time before constructor,==>   by every calling constructor it is called again
		System.out.println("First instance init");
	}

	{     // 2. initialisation bloc runs before constructor
		System.out.println("Second instance init");
	}

	static {  // run first static
		System.out.println("Second static init");
	}

}
