package day30_rehearsal;

public class Task97 {

	public static void main(String[] args) {
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		filterString(str);

	}

	
	public static void filterString(String str) {
		
		String sum="";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isAlphabetic(str.codePointAt(i)) || str.charAt(i)==' ')
			
				sum=sum+str.charAt(i);
			
			
		}
		
		System.out.println(sum);
		
		
	}
	
	
}
