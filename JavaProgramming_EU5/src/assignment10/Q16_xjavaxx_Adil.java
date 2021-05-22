package assignment10;

public class Q16_xjavaxx_Adil {

    public static void main(String[] args) {
        
        wordAppear("javapython");
        wordAppear("cjavac++");
        wordAppear("c#javaruby");
        

    }
    
    public static void wordAppear(String str) {
        
        if (str.length()<4) {
            System.out.println("invalid entry");;
        } else {
            for (int i=0; i<2; i++) {
                if (str.substring(i, i+4).equals("java")){
                System.out.println("true");
                break;
                }
                
            System.out.println("false");
            }
        }
        
    }
}

/*
 * String word = "xxjava";

        if (word.length() < 4) {
            System.out.println("Word length must be greater than or equal 4!");
            return;
        }

        if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
*/