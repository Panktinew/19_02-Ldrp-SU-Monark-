package inheritance_example;

public  class Country {
	private String cname;
	
	
	
	public String getCname() {
		return cname;
	}

	 void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}
	

}
