package tnsif.employee.firstpackage;

public class Base {
	
	   int defaultVar = 12;
	   
	   public String publicVar="Public";
	   private float privateVar=34.5f;
       protected long protectedVar=4567L;  	   

     int getDefaultVar() {
		return defaultVar;
	}

     public String getPublicVar() {
		return publicVar;
	}

	public void setPublicVar(String publicVar) {
		this.publicVar = publicVar;
	}

	private float getPrivateVar() {
		return privateVar;
	}

	private void setPrivateVar(float privateVar) {
		this.privateVar = privateVar;
	}

	protected long getProtectedVar() {
		return protectedVar;
	}

	protected void setProtectedVar(long protectedVar) {
		this.protectedVar = protectedVar;
	}

	void setDefaultVar(int defaultVar) {
		this.defaultVar = defaultVar;
	}

	 
}

