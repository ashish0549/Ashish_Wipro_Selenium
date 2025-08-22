
//3. Contract Programming: Printer Switch
//•	Declare an interface Printer with method void print(String document).
//•	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
//•	In the client code, declare Printer p;, switch implementations at runtime, and test printing.


package Day_5_Assignment;
interface Printer {
    void print(String document);
}
class LaserPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("[LaserPrinter] Printing with precision: " + document);
    }
}
class InkjetPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("[InkjetPrinter] Spraying ink to print: " + document);
    }
}

public class Interface_3 {

	 public static void main(String[] args) {
	        Printer p;

	        // Use LaserPrinter
	        p = new LaserPrinter();
	        p.print("Laser Printer: Annual Report.pdf");

	        // Switch to InkjetPrinter at runtime
	        p = new InkjetPrinter();
	        p.print("Inkjet Printer: Family Photo.jpg");
	    }
	}
