package assignment10;

public class Q19_numberOfJavaMethodsuz {

    public static void main(String[] args) {
        
        String str = "javaxjavaapplepearjavaegg";
        int counter=0;
//        for (int i=0; i<str.length()-3; i++) {
//            if (str.substring(i, i+4).equals("java")) {
//                counter++;
//            }
//            
//        }
//        System.out.println("the number of " + "\"java\"" + " in the input is: " + counter);
//        
        while(str.contains("java")){
        
            str = str.replaceFirst("java", "");
            counter++;
           // System.out.println(str);
        }
        System.out.println(counter);
    }

}

/*Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3 */