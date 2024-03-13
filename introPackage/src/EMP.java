
public class EMP {

	static int count=0;
	int eno;

	public EMP(int eno) {
		super();
		this.eno = eno;
		count++;
	}
	public static void gethello() {
	//	eno=1;
		count++;
	}

	static {
		count++;
		
	}
	@Override
	public String toString() {
		return "EMP [eno=" + eno + "]";
	}
	
	
}
