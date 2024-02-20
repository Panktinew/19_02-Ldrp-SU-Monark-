package firstSession_19_02;

public class FirstClass {

	public static void main(String[] args) {
		
		//   Sysout +( ctrl+space)
 
            System.out.println("Welcome !!!!");

             int totalMarks = 89;   //declaration
		        
               

    if(totalMarks > 80 && totalMarks<=90) {
    	System.out.println("GradeA");
    	
    }
    else if (totalMarks  > 70 && totalMarks <=80) {
    	System.out.println("GradeB");
    }
    else if (totalMarks  > 60 && totalMarks <=70) {
    	System.out.println("Gradec");
    }
    
    
    
    else{
    	System.out.println("NoGrade");
    }

             
             
		      //var (condition)? True : False
    
    
    int no1 = 02;
	int no2 = 60;
	int result = (no1>no2)? no1 : no2;
    System.out.println(result);

	
	    switch(no1 )
	    {
	    case 1:   System.out.println("this is case 1");
	    break;
	    case 2:   System.out.println("this is case 2");
	    break;
	    case 3:   System.out.println("this is case 3");
	    break;
	    default:   System.out.println("default");
	    }
	
	   int o=11,p=10;
	   
	   
	    int k = o++;
	    
	    System.out.println("k=" + k + "o=" +o);
	    
	    
	    int l = --p;
	    
	    /*   l=p-- 
	     * 1.   l=p
	     * 2.  p--
	     *    
	     */
	    
	    System.out.println("l=" + l + "p=" +p);
	    
	    
	    
	    for(int i=1,j=11 ; i<=10 && j>=1; ++i ,j--) {
	    	
	    	
	    	System.out.println("i=" + i+ " j = " + j);
	    }
	}

}
