package inheritance_example;
class A
{
    int i = 10;
    public void test() {
    	System.out.println("A");
    }
}
 
class B extends A
{
    int i = 20;
    
   
    public void test() {
    	System.out.println("B");
    }
}
 

public class DemoSingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a;   ///object of parent class
		  a = new B();   // reference of child class
		  
	    
		System.out.println(a.i);
		
		a.test();
		
		
		
		//Student s = new Student("a1","a2","a3","a4","a5");
		
		
		/*s.setName( "Urvi");
		s.setAdharNo("4588 565");
		s.setEmail("urvi@gmail.com");
		s.setUID("U1213");
		s.setCourseName("B.Tech");
		*/
		
		
		//System.out.println(s.displasy() +  s.toString());
		
	/*	City c = new City();
		
		City c1 = new Country();
		
		
     Country cobj = new City();		
     Country cobj1 = new State();
		
		c.setCname("India");
		c.setSname("Gujarat");
		c.setCityName("Ahmedbad");
		System.out.println(c.toString());
		
		
*/
		
	
		
	Employee e1 =  new Employee();
	Student s1 = new Student();
	
	
	
	
	
	

	e1.setName("Urvi");
	e1.setEmail("Urvi@gmail.com");
	e1.setAdharNo("45654ghg");
     e1.setDesignation("Manager");

     System.out.println(e1);
	
	
	s1.setName("Pooja");
	s1.setAdharNo("43545");
	s1.setEmail("pooja@.com");
	s1.setUID("t4656");
	s1.setCourseName("B.Sc");
	
	 System.out.println(s1);
		
	
		
	
	}

}
