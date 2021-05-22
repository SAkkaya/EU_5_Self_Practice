package assignment10;

public class Question28 {

    public static void main(String[] args) {
  
        
        String str=clean ("he said bla bla bla","bla");
        System.out.println(str);
        

    }

    public static String clean(String string, String string2) {
        
        return  string.replace(string2, "");
        
        
    }

}


/*Question-28

This method gets two strings (text and badWord) and returns a string. Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said "*/