package inheritance_constructor;

public class Citizen {
	
	
	private String name,email,adhar;
	
	
	public Citizen() {
		
		name = "null";
		email = "enull";
		adhar="anull";
	}


	public Citizen(String name, String email, String adhar) {
		super();
		this.name = name;
		this.email = email;
		this.adhar = adhar;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", email=" + email + ", adhar=" + adhar + "]";
	}


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


	public String getAdhar() {
		return adhar;
	}


	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	
	

	
	
	
}
