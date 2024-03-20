package exception_examples;

public class SimpleException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int k,l;
		  k=12;
		 
		  
		  try {
			  l=-23;
			  if(l<0) {
				  throw new ArithmeticException("Please enter positive number");
			  }
		  }
		  catch(ArithmeticException ar) {
			  System.out.println(ar.getMessage());
		  }
		  
		  
		  
		  
		  int[] arr = {1,3,4,6,9};
		  
		  
		  
		  
		  
		  
		  try {
		 // System.out.println(k/l);
		  System.out.println(arr[5]);
		  
		  }
		  catch(ArithmeticException  | NullPointerException np) {
        	  System.out.println("you can not" + np.getMessage() + "  Please enter bigger than 0");
          }
		  
		  catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("inside arrayindexoutofbound cath"+e.getMessage()) ;
			   System.exit(0);
		  }
		  catch(Exception e) {
			  System.out.println(e.getMessage()) ;
		  }
		 
		  finally {
			  System.out.println("please  release all the memory!!");
		  }
		  
	}

}
