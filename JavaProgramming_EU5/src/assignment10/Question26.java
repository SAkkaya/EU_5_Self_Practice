package assignment10;

public class Question26 {

    public static void main(String[] args) {
        
    String str=    uniqueChars("java");
    System.out.println(str);
        
        

    }

    public static String uniqueChars(String string) {
        String dummy="";
        
        for (int i = 0; i < string.length(); i++) {
            String searched=""+string.charAt(i);
            if (!dummy.contains(searched) ) {
                dummy+=searched;
                
            }
            
        }
        
        
        return dummy;
    }

}



/*Question-26

uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"*/