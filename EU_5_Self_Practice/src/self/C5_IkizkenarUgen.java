package self;


public class C5_IkizkenarUgen {

	public static void main(String[] args) {

		int n=3; //outer loop n==>rows

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }
		
	}
}
		
//		
//		for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < k; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j < k; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//		}
//
//	
//}