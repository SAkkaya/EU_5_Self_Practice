package assignment10;

public class Question29 {

    public static void main(String[] args) {
        
        String str=limit("bla bla",3);
        
      System.out.println(str);
    }

    private static String limit(String string, int i) {
        
        return string.substring(0,i);
    }

}


/*Question-29

This method gets a string and an int, it returns a string. What it does is to limit the inputted string to a creating number of characters.

Sample Output:

     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla"*/