package instanceofinterface;

public class PhoneFactory {
	
	
	
	public static Jio createJio(String company) {
		
		Jio j = new Jio();
		
		     return (j);
	}
	public static Samsung createSAmsung(String company) {
		
		Samsung sm = new Samsung();
				
	     return (sm);
}

	
	public static Phone createPhone(String company) {
				
				if (company.equalsIgnoreCase("Samsung"))
					return new Samsung();
				else if (company.equalsIgnoreCase("Jio"))
					return new Jio();
				
				else if (company.equalsIgnoreCase("oppo"))
					return new Oppo();
				else
				return null;
			
			
			}

	
	
	
}
