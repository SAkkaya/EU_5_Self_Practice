package day35_encapsulation;

public class PrinterSTest {

    public static void main(String[] args) {
        
        PrinterS printer1=new PrinterS();
        System.out.println(printer1.toString());
        //printer1.setDublex(true);
        //printer1.FillUpPaper(4);
        printer1.setNumberOfPage(4);
        
        printer1.printPage(4,true);
        
        //System.out.println(printer1.toString());
        
        System.out.println("Toner level is " + printer1.getTonerLevel());
        System.out.println("Remaining paper  is " + printer1.getNumberOfPage());
        
    }

}