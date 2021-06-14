package day40_accessmodifiers_final_hiding;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE= 600;// 1. way==> initilising and assigning the value at the same time
	public final int MODEL_3_MAXSPEED;  // 2. way==>initialising the value by creating a constructor
	public final int MODEL_X_PASSENGERS;  //3.way ==>by  init blog 
	
	public static final String ADMIN_USERNAME;// where this variable will be initialized if you cannot create a new object
												// you have initialise final 
												// bu yuzden constructor icinde degil static blok icinde atayabilirsin, ya da ayni anda yukarda==> public static final String ADMIN_USERNAME="OZZY";
	public FinalVariables(){ // 2. way==>initialising the value by creating a constructor
		MODEL_3_MAXSPEED=200;
		//ADMIN_USERNAME="OZZY"; // WHY ERROR  // object yaratmadan constructor calismayacak ve static VIP bucket a atama yapamayacak, ilk static calisir
	}
	
	{  // instance block  
		
		MODEL_X_PASSENGERS=7;  //3.way ==>by  init blog 
		//ADMIN_USERNAME="OZZY"; // kabul etmez  ==> cunku ;
		
							//	==> instance block  only run only when you create an object before the constructor
	}
	
	
	static { // static block    ==> runs only once whenever you load the class, it doesnot care about oBject creation, that is why it does it 
		ADMIN_USERNAME="OZZY";
	}


	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT =5; // if it is inside the method it is LOCAL VARIABLES 
	
		//public final int SSN; //******* local variables can not have ACCESS MODIFIERS like public, private, protected
		
		
		final int SSN; // local variables only valid within method, you do not have to initialise it like instance variable inside class
	
		SSN=66;
		//SSN++; // i can not do it because it is final value
	
		
		FinalVariables finalVars = new FinalVariables(); 
		System.out.println(finalVars.ROADSTER_MAX_RANGE); // ROADSTER_MAX_RANGE  is not static i can reach through objectName==>finalVars
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		
		System.out.println(ADMIN_USERNAME); // class name kullanmadim , static isnstance variable 
											// cunku ayni CLASS icindeysem directly variable a ulasabilirim!!!!!!
		//System.out.println(FinalVariables.ADMIN_USERNAME); // CLASS NAME ILE ZATEN OLUYOR
	
		
	
	
	}

}





