package tndif.student.generateId;

public class Student {
	int UID;
	String sfullname,semail;

	// default constructor
	public   Student( ) {
		System.out.println("welcome to the system!!");
		
		UID=1;
		sfullname = "test";
		semail="test@testing.com";
	}
	
	
	
	
	//param constructor
    public  Student(int uID, String sfullname, String semail) {
		
		super();
		System.out.println("welcome to the system!!");
		UID = uID;
		this.sfullname = sfullname;
		this.semail = semail;
	}





	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getSfullname() {
		return sfullname;
	}
	public void setSfullname(String sfullname) {
		this.sfullname = sfullname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	@Override
	public String toString() {
		return "Student [UID=" + UID + ", sfullname=" + sfullname + ", semail=" + semail + "]";
	}
	

}
