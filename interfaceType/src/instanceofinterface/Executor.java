package instanceofinterface;

public class Executor {

	public static void main(String[] args) {
		
		//loose coupling
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		// TODO Auto-generated method stub

		p1 = PhoneFactory.createPhone("oppo"); 
		p1.call();
		p1.sms();
		
		
/*	Jio j = new Jio();
	j=PhoneFactory.createJio("jio card");
	j.call();
	j.sms();
	
	
	Samsung sm = new Samsung();
	
	sm=PhoneFactory.createSAmsung("Samsung card");
	
	sm.call();
	sm.sms();

	*/
	}

}
