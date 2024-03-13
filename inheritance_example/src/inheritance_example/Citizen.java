package inheritance_example;

public class Citizen {
	 private String name,adharNo,email;
	 
	 
	 

	public Citizen() {
		this.name = "TEst name";
		this.adharNo = "Test adharNo";
		this.email = "test email";
	}

	public Citizen(String name, String adharNo, String email) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String displasy() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", email=" + email + "]";
	}
	
	
	

}
