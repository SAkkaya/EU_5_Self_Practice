package assignment10;

public class Q25_mergeStrings {

    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "selenium";
        mergeString(s1, s2);

    }

    public static void mergeString(String s1, String s2) {

        String dummy = "";
        int x = s1.length();
        int y = s2.length();
        int c =0;
        if (x>y) {
            c=y;
        } else {
            c=x;
        }
        for (int i = 0; i < c; i++) {

            dummy += "" + s1.charAt(i) + s2.charAt(i);

            } 
            
        if (x>y) {
            dummy = dummy + s1.substring(y);
        }else {
            dummy = dummy + s2.substring(x);
            
        }
        
        System.out.println(dummy);

    }

}

/*Question-25

When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"*/