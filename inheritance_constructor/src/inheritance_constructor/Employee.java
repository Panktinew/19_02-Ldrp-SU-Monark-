package inheritance_constructor;

public class Employee extends  Citizen{

	 private  String designation;
	
	public Employee() {
	
		super();   ///it will calll default constructor of parent class
		designation="Test";
		
		
	}
	
	public Employee(String name,String adhar,String email,String desig)
	
	{
		super(name,adhar,email);  // will call param constructor
		designation=desig;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", toString()=" + getName() + getEmail() + getAdhar();
	}

}
	
	
	

