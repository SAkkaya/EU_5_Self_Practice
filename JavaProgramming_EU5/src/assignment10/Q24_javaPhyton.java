package assignment10;

public class Q24_javaPhyton {

    public static void main(String[] args) {
        
        String input = "What's the difference between java, javascript and python?";
        
        int countJava = Q19_numberOfJava.wordCounter(input, "java");
        System.out.println("java: " + countJava);
        
        int countPython = Q19_numberOfJava.wordCounter(input, "python");
        System.out.println("python: " + countPython);
        
        if (countJava==countPython) {
            System.out.println("output: " + true);
        } else {
            System.out.println("output: " + false);
        }
    }
     

}

/*Question-24

Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false*/