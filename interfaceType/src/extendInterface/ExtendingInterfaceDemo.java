package extendInterface;

public class ExtendingInterfaceDemo implements childInterface {
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String[] args) {

ExtendingInterfaceDemo exdemp =new ExtendingInterfaceDemo(); 
		
		exdemp.print();
		exdemp.show();
		
	}

}
