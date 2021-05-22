package day5_unary_assignment_relational_operators;

public class C4_task18_prepostDecrementIncrement {

	public static void main(String[] args) {
		
		int x =2;
		int y = x++; //y =2     ====> int y = ++x; //y =3  olacak ti pre increment ayni satirda aktiv olur
		
		// y=x;  yaparsam sonraki satir da y ve x ===. ikis de 3 olur d
		
		System.out.println(x); //3
		System.out.println(y);  //2
		
		x=2;
		System.out.println(x++);//2
		
		
		x=2;
		System.out.println(--x); //1
		
		
		x=8;
		y=x--;
		System.out.println(y); //8
		
		
		
	}

}
