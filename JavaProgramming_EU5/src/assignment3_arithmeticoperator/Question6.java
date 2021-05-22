package assignment3_arithmeticoperator;

public class Question6 {

	public static void main(String[] args) {
		
		int maxCaffeine=10000;   //1 gr = 1000 mg  ==> 10 gr =10000 mg  ==> overdose
        
		int oneDrinkCaffeine=500;
        int maxDrinks=maxCaffeine/oneDrinkCaffeine;
        
        System.out.println("Number of milligrams in drink : "+oneDrinkCaffeine);
        System.out.println("It would take about "+maxDrinks+" drinks for lethal dose");
        

	}

}
