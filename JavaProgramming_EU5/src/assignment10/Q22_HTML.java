package assignment10;

public class Q22_HTML {

    
    public static void main(String[] args) {
        
        String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

        if (!(html.contains("html"))) {
            System.out.println("Invalid input!");
            return;
        }

        int firstQuote = html.indexOf('"');
        int secondQuote = html.indexOf('"', firstQuote + 1);

        String idAttribute = html.substring(firstQuote + 1, secondQuote);
        System.out.println(idAttribute);

    }

}

/*Hypertext Markup Language (HTML) is the standard markup language for creating web pages and web applications. HTML is the language in which most websites are written. HTML is used to create pages and make them functional.

a10q22

Write a program, that will read HTML variable and output attribute value of id attribute (tag) into the console. Input will be provided in a single line as outlined below. If HTML variable doesn't contain <html> attribute, print out into the console message: "Invalid input!".

Sample Output:

     input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
     output: myid*/