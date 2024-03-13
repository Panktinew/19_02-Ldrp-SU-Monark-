package inheritance_constructor;

public class Parent {
	
	private int UID;
private String adharno;
	
	public Parent() {
		
		UID=0;
		adharno="";
	}
	
	
	
	
	
	
	
	public Parent(int uID,String ano) {
	
		UID = uID;
		adharno =ano;
	}






	public String getAdharno() {
		return adharno;
	}







	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}







	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}

	@Override
	public String toString() {
		return "Parent [UID=" + UID + ", adharno=" + adharno + "]";
	}
	
	
	
	

}
