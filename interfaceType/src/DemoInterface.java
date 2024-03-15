
public class DemoInterface implements WildAnimal    {

	
	@Override
	public void eat() {
		System.out.println("WE love to it another small insects!!");
	}
	
	public void bark() {
		System.out.println("hello hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    DemoInterface dt = new DemoInterface();
		    dt.eat();
		    dt.bark();
		    
		    Animal an;
		    
		    
		    an = new Dog();
		    an.eat();
		    
		    an = new Horse();
		    an.eat();
		    
	}

}
