package oopsConcept;

import java.util.Scanner;

public class PersonDemo {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,email;
		int age;
		Person p =new Person();   //object of class person
 
		//p.getData("Pooja","pooja@gmail.com",13);
		//p.display();
	
	Scanner  sc =  new Scanner(System.in);
    
	System.out.println("Enter you name");
	name = sc.nextLine();
	System.out.println("Enter you age");
	age= sc.nextInt();
	
		p.setName(name);
		p.setAge(age);
		p.setEmail("rajesh@gmail.com");
		p.setIncome(45000);
		
		
	
		
		p.check_Eligible();
		p.check_Eligible(p.getAge());
	
	
 TaxCalculation txc= new TaxCalculation();
	   txc.calculateTax(p);
	  
	  
	
	}

}
