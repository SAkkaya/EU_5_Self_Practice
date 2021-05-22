package day35_encapsulation;

public class PrinterS {

	/*
	 * Create a class and demonstrate proper encapsulation technique. •The class
	 * will be called Printer•It will simulate a real Computer Printer •It should
	 * have fields for the toner Level, number of pages printed, and•also whether
	 * its a duplex printer (capable of printing on both sides of the paper). •Add
	 * methods to fill up the toner (up to a maximum of 100%), another method to
	 * simulate printing a page (which should increase the number of pages printed).
	 * •Decide on the scope, whether to use constructors, and anything else you
	 * think is needed
	 */

	private int numberOfPage;
	private int tonerLevel;
	private boolean isDublex;

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public boolean isDublex() {
		return isDublex;
	}

	public void setDublex(boolean isDublex) {
		this.isDublex = isDublex;
	}

	public PrinterS() {
		this.numberOfPage = 0;
		this.tonerLevel = 100;
		this.isDublex = false;
	}

	public void FillUpToner(int addToner) {

		if (tonerLevel + addToner >= 100) {
			tonerLevel = 100;
		} else {
			tonerLevel += addToner;
		}

	}

	public void FillUpPaper(int addedPaper) {

		numberOfPage += addedPaper;

	}

	public void printPage(int printOut,boolean isDublex) {

		if (numberOfPage >= printOut) {

			if (isDublex) {
				numberOfPage -= Math.ceil(printOut / 2.0);
				tonerLevel -= 20*printOut;
			} else {
				numberOfPage -= printOut;
				tonerLevel -= 20*printOut;
			}

			System.out.println("o iş tamam");
			
		} else {
			System.out.println("Not enough paper");
			System.exit(0);
		}

	}

	@Override
	public String toString() {
		return "PrinterS [numberOfPage=" + numberOfPage + ", tonerLevel=" + tonerLevel + ", isDublex=" + isDublex
				+ ", getNumberOfPage()=" + getNumberOfPage() + ", getTonerLevel()=" + getTonerLevel() + ", isDublex()="
				+ isDublex() + "]";
	}

	
	
	
}
	
	
