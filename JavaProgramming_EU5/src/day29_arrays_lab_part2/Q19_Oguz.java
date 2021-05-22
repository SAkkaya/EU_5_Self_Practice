package day29_arrays_lab_part2;

public class Q19_Oguz {

	public static void main(String[] args) {
		
	        int[] x = {1,2,2};
	        int[] y = {1, 2, 2, 6, 99, 99, 7};
	        int[] a = {1,1,6,7,2};
	        int[] b = {1,1,6,2};
	        int[] c = {1,6,5,7,2,6,99,7,3,4};
	        
	    
	        System.out.println(sum(x));
	        System.out.println(sum(y));
	        System.out.println(sum(a));
	        System.out.println(sum(b));
	        System.out.println(sum(c));

	    }
	    public static int sum(int [] x) {
	        int sum=0;
	        boolean flag=false;
	        
	        for(int i=0;i<x.length;i++) {
	            
	            
	            if(x[i]==6) {
	                flag=true;
	                
	            }else if(flag) {
	                
	                if(x[i]==7) {
	                    flag=false;
	                }
	                
	            }else {
	                sum=sum+x[i];
	                
	            }
	        }
	        
	        return sum;
	        //int[] c = {1,2,2,6,99,99,7,3,4};
	        
	    }
	}
	/*
	Write a method that accepts an array and prints the total of the numbers in the 
	array, except ignore sections of numbers starting with a 6 and extending to the 
	next 7 (every 6 will be followed by at least one 7).
	int[] x = {1,2,2} = > 5
	int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
	int[] a = {1,1,6,7,2} = > 4
	int[] b = {1,1,6,2} = > 2
	int[] c = {1,2,2,6,99,99,7,3,4} = > 12
	*/
