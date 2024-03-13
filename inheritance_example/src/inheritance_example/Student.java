package inheritance_example;

public class Student  extends Citizen{
	
	
   private	String UID,CourseName;

	/*public Student(String uID, String courseName,String name,String adharNo,String  email) {
	super(name,adharNo,email);
	UID = uID;
	CourseName = courseName;
}
*/
	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public String toString() {
		return "Student [UID=" + UID + ", CourseName=" + CourseName + "]";
	}
	
	
	
	

}
