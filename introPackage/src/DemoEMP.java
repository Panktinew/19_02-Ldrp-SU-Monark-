import java.io.*;
public class DemoEMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int eno1=0;
   
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     
   try {
	   
	   
	   eno1 = Integer.parseInt(br.readLine());  ///convert type from string to integer
	   
	   EMP e1 = new EMP(eno1);
	   System.out.println(e1.toString());
	   
   }
   catch(Exception e) {
	   
	   System.out.println(e.getMessage());
	   
   }
   
   
   
   EMP e2 = new EMP(13);
   EMP e3 = new EMP(14);
		System.out.println(EMP.count);
		  
	}

}
