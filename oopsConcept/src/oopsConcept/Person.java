package oopsConcept;

public class Person {
	
	// Data Members
	
	  //  'default' is default access modifier
	    private String name,email;
	    private int age,income;
		
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", email=" + email + ", age=" + age + ", income=" + income + "]";
		}
		
		// function overrloading
		public void check_Eligible() {
			int age = 32;
			
			if(age >= 18) {
				System.out.println( "you can do voting");
			}
			else
			 {
				System.out.println( "you can not do voting");
			}
		}
		
     public void check_Eligible(int age) {
    	 
    	 if(age >= 18) {
				System.out.println( "you can do voting");
			}
			else
			 {
				System.out.println( "you can not do voting");
			}
			
		}
		
		
	
  //Member Functions(methods)
	    
	   
	    
	    
	    
	    
	   /* public  void  getData(String name1,String email,int age   ) {
	    	name=name1;
	    	this.email =email; 
	    	this.age  =  age;
	    }
	    
	    public void display() {
	    	
	    	System.out.println(name + " " + email + " " + " " + age);
	    }*/
}
