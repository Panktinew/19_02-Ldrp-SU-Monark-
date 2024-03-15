package hasArelation;

public class Person {
	
	String fullname;
	int mobileNo;
	Address add  = new Address();   // has a relationship
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", mobileNo=" + mobileNo + ", add=" + add + "]";
	}
	
	
	

}
