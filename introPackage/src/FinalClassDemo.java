
//Program to demonstrate final class


final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}
final class Test{
	public void test1() {
		System.out.println("this is fianl class");
	}
}

class TestFinal extends Test{
	
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClass {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		Test t1 = new Test();
		t1.test1();
		f1.show();
	}
}