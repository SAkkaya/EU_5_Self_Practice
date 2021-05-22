package assignment10;

public class Q19_numberOfJava {

    public static void main(String[] args) {
        
        int count = wordCounter("javaxjavaapplepearjavaegg", "java");
        System.out.println(count);
        
//        for (int i=0; i<str.length()-3; i++) {
//            if (str.substring(i, i+4).equals("java")) {
//                counter++;
//            }
//            
//        }
//        System.out.println("the number of " + "\"java\"" + " in the input is: " + counter);
//        
        
    }
    
    public static int wordCounter(String inputWord, String searchWord) {
        String str = inputWord;
        int counter=0;
        while(str.contains(searchWord)){
            
            str = str.replaceFirst(searchWord, "");
            counter++;
            
        }
        
        return counter;
        
    }

}