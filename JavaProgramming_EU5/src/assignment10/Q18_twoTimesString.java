package assignment10;

public class Q18_twoTimesString {
	 
	public static void main(String[] args) {
	        
	  repeated("Word", "X", 3);
      repeated("This", "And", 2);
      repeated("This", "And", 1);

  }
  
  public static void repeated(String word, String sep, int times) {
      
      String newWord= word ;
      for (int i=1; i<times; i++) {
              newWord= newWord+sep+word;
                  
              }
          
          System.out.println(newWord);
      
  }
}

/*String word = "Word";
      String seperator = "X";
      
      int count = 5;
      
      for(int i = 0; i<count; i++) {
          System.out.print(word);
          
          if(i<count-1) {
              System.out.print(seperator);
          }
      }

*/



/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This  */