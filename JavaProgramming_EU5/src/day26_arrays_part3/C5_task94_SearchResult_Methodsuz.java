package day26_arrays_part3;

import java.util.Arrays;

public class C5_task94_SearchResult_Methodsuz {

	public static void main(String[] args) {
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

		String[] arr = info1.split("xxx");
		String[] arr2 = info2.split("xxx");
		
//		System.out.println(arr.toString());//[Ljava.lang.String;@182decdb
//		System.out.println(Arrays.toString(arr)); //[This info is used for creation password : , CD132G,  . Please do not share with anyone]
		

//		for (String value : arr) {
//			System.out.println(value);
//		}
//		System.out.println(arr.length);//3
//		System.out.println(arr [1]);
//		
//		System.out.println(arr2 [1]);
		
		System.out.println(arr[1].concat(arr2[1])); //CD132G00ABC!

	}

}
