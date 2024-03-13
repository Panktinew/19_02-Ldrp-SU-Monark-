package static_final_abstract;

// final class --- inheritance is not allowed.you can not make final class as parent class

final class Test{
	
}
public class College extends Test {
	
	
	/*   static --- variable,function,block   */
	
	final int sid =0;
	static int cnt=0; ///depends on class ,single copy
	static String College_name="GLS";

	String stu_name,stu_email ;
	
	public College() {
		cnt++;
		
	}

	static {
		cnt =1;
		System.out.println(College_name);
	}
	final void getMsg() {
	// static function can access only static variable
		System.out.println(College_name);
		
	}
	
	
	public String getStu_email() {
		return stu_email;
	}

	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	@Override
	public String toString() {
		return "College [stu_name=" + stu_name + ", stu_email=" + stu_email + "]";
	}
	

}
