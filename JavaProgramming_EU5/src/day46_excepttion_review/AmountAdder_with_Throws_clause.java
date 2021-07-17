package day46_excepttion_review;

public class AmountAdder_with_Throws_clause {
	
	
	   static Amount addAmounts(Amount amount1, Amount amount2) throws Exception{ // will not have a compile Error , it is fixed 
	        if(!amount1.currency.equals(amount2.currency)){
	            throw new Exception("Currencies do not match");
	            // Exception  class is not Error and RuntimeException  classes that that is why it is NOT UncheckedException.
	        }
	        return new Amount(amount1.currency,amount1.amount+amount2.amount);
	    }
	    
	    
	   
	    
	}


/*Rule : When you declare a checked exception, whoever calls this method is responsible to handle it or redeclare it

Option-1
    public static void main(String[] args) throws Exception{
        AmountAdder.addAmounts(new Amount("usd",50),new Amount("euro",5));
    }

Option-2
    public static void main(String[] args){
        try{
            AmountAdder.addAmounts(new Amount("usd",50),new Amount("euro",5));
        }catch(Exception e){
            System.out.println("Exception handled in main");
        }
        
    }
​
*/