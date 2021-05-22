package assignment10;

public class Q17_alpOrderTwoChars  {

public static void main(String[] args) {
        
        alphabet('A', 'Z');
        alphabet('a', 'f');
        alphabet('a', 'd');
        alphabet('B', 'O');

    }
    
    public static void alphabet(char a, char b) {
        
        
        for (char i=a; i<=b; i++) {
            System.out.print(i+ " ");    
        }
        System.out.println();
        
    }

}

/*Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO*/