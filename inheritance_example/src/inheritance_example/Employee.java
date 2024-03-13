package inheritance_example;

public class Employee extends Citizen  {
	String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation  +  "]" + getName() + " " + getEmail() + getAdharNo()
		;
		 
	}
	

}
