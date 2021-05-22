package day17_classObjects_Part2;

public class CapitalOne {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		
		System.out.println(acc1); //day17_classObjects_Part2.BankAccount@5e91993f   ==> address of the object in the heap
		System.out.println(acc2); //day17_classObjects_Part2.BankAccount@156643d4   ==> farkli referans numarasi verdi diger object olusturulunca  
		
		acc1.accountHolder = "Mike Smith";
		
		acc1.accountNumber=12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.withdraw(100);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();
		

	}

}
