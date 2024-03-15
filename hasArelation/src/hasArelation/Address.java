package hasArelation;

public class Address {
	
	String streetName,area;
	int pinCode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", area=" + area + ", pinCode=" + pinCode + "]";
	}
	
	
	
	

}
