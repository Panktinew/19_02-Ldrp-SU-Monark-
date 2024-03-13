
package tnsif.customer.secondpackage;


import tnsif.employee.firstpackage.*;
import tndif.student.generateId.*;

public class DemoBase extends Base  {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Base b = new Base();
		
		//b.setDefaultVar(56);   //default is not accessesible outside the package
	  //System.out.println(b.getDefaultVar());
		
		
		
		DemoBase db = new DemoBase();
	System.out.println(db.getProtectedVar());
		
		
		
	}

}
