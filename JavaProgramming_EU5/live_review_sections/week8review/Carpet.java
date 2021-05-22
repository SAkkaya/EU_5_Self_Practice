package week8review;

public class Carpet {

	public double width, length, unitPrice;
	public boolean isPersian;
	
	
	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
	
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
	}
	
	
	public double calcCost(){
		double totalPrice=0;
		totalPrice=width*length*unitPrice;
		
		if (isPersian) {
			totalPrice+=300;
		}
		
		return totalPrice;
	}


	public String toString() {
		return "Carpet [width=" + width + ", length=" + length + ", unitPrice=" + unitPrice + ", isPersian=" + isPersian
				+ "]";
	}
	
	
	
	
	
	
	
}
