package oopsConcept;

public class TaxCalculation {
	
	public void calculateTax(Person p ) {
		
		if(p.getAge() > 50 && p.getIncome() >=50000) {
			
			System.out.println("need to pax tax");
		}
		else {
			System.out.println("  no need to pax tax");
	}
	}

}
