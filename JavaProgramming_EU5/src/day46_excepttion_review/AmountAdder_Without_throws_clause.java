package day46_excepttion_review;

 class AmountAdder_Without_throws_clause {      // without throws
	
	 //Error and RuntimeException  classes that extends them are called UncheckedException.
	 // other than that checked exception like as below ==> Exception class so you need to handle it by 2 ways(1. TRY/ Catch blocs 2. Throws decleration)
	 
	    static Amount addAmounts(Amount amount1, Amount amount2){
	        if(!amount1.currency.equals(amount2.currency)){
	            throw new Exception("Currencies do not match");
	            // Exception  class is not Error and RuntimeException  classes that that is why it is NOT UncheckedException.
	        }
	        return new Amount(amount1.currency,amount1.amount+amount2.amount);
	    }
	    
	    
	    
	    
	}


