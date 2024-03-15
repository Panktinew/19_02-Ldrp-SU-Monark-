package hasArelation;

public class DempHas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Car audi = new Car();

System.out.println(Car.speed + Car.color);

audi.go();
audi.customDesign();
		
		
Address addr = new Address();
addr.setArea("satellite");
addr.setPinCode(12345);
addr.setStreetName("abc");
		


Person p = new Person();
p.setFullname("Radha");
p.setMobileNo(99092);
p.setAdd(addr);


System.out.println(p);


	}

}
