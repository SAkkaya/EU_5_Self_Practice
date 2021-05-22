package assignment10;

public class Question27 {

    public static void main(String[] args) {

        String str = coverString("java methodsme", "me");
        System.out.println(str);

    }

    public static String coverString(String string, String string2) {
        //String str=coverString("java methodsme", "me")  ; 
        if (!string.contains(string2)) {
            return "["+ string+"]";
            
        }else {
            
            String dummy="";
            String a="["+string2+"]";
            for (int i = 0; i < string.length(); i++) {
                
                    dummy=dummy+string.charAt(i);
                            
                if (i==string.indexOf(string2)-1) {
                    dummy=dummy+a;
                    i=i+string2.length()-1;
                    string=string.replaceFirst(string2, " ");
                }
                
            }
                        
            return dummy;
        }
        
        
    }

}

/*Question-27

coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Sample Output:

     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]"*/
