package inheritance_constructor;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Child chl = new Child(); // 1  --- Parent class  default constructor  2 --- it will call it's own constructor  
	
	
	
	
	Child ch1 = new Child(1,"Nisha","adhar1");
	
	
	
	System.out.println(chl);
	System.out.println(ch1);
	
	
	/*  citizen ---  name,email,adhar
	 *   employee  --- desig
	 */
	
	Employee e1 = new Employee("Raj","Raj@.com","r0101","Programmer");
	
	
	System.out.println(e1);
	
	}

}
