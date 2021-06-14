package day40_accessmodifiers_final_hiding;

public class KangarooTest {

	public static void main(String[] args) {
		
		
		Kangaroo k = new Kangaroo();
		
		/*  @Overriding ile sonuc 
		
		k.getMarsupialDescription(); //Marsupial walks on the two legs :true  
				// true cunku k.  kangorro ya gidecek orda isBiped methodu Overriding dolayisiyla Kangorrodaki methodu alcak 
		
		*/
		
		k.getMarsupialDescription(); // hiding ile sonucu ==> false
		//Marsupial walks on the two legs :false
		
		k.getKangarooDescription(); //Kangaroo hops on two legs:true

	}

}
