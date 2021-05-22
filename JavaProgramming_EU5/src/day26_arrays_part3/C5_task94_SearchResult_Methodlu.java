package day26_arrays_part3;

import java.util.Arrays;

public class C5_task94_SearchResult_Methodlu {

	public static void main(String[] args) {

		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		createPasswort(info1, info2);

		System.out.println("your password is:" + createPasswort(info1, info2));

	}

	private static String createPasswort(String info1, String info2) {
		String[] arr1 = info1.split("xxx");
		System.out.println(Arrays.toString(info1.split("xxx")));
		
		String[] arr2 = info2.split("xxx");
		
		return arr1[1].concat(arr2[1]);
		//return arr1[1].trim().concat(arr2[1].trim());
	
	

	}

}
