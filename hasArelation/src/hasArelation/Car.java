package hasArelation;

public class Car extends Address  implements Vehicle,Design   {
	
	@Override
	public void go() {
		
		System.out.println("I am in the car");
	}
	public void customDesign() {
		
		System.out.println("need to do have with unique features");
	}

}
