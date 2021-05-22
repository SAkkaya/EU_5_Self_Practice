package week6;

public class Task3_benim {

	public static void main(String[] args) {
		
		String[] employees = {"John", "Conor McGregor", "Rose", "Breanna", "Shay", "Khabib"};
		int[] salaries = {100000, 17000, 95000, 110000, 180000, 150000};
		
		employee(employees, salaries);
		
	}
	
	public static void employee(String []names, int [] salary) {
		
		
		String maxNames = "";
		String minNames="";
		
		
		int max=salary[0];  //int max=0; ; 
		int min=max; //int min=salary[0];

		for (int i = 0; i < salary.length; i++) {

			if (salary[i]>max) {
				max=salary[i];
				maxNames= names[i];
			}
			
			if (salary[i]<min) {
				min=salary[i];
				minNames= names[i];
			}
			
			
			
		}System.out.println("employee "+ maxNames+ " has the highest salary : " + max);
		
		System.out.println("employee "+ minNames+ " has the lowest salary : " + min);
			
		}
			
	}




/*given the arrays of employee names and their salaries:

String[] employees = {"John", "Conor McGregor", "Rose", "Breanna", "Shay", "Khabib"}

int[] salaries = {100000, 70000, 95000, 110000, 120000, 150000}

1. display the name of the employee who has the highest salary

2. display the name of the employee who has the lowest salary*/



