package tndif.student.generateId;
import java.io.*;
import java.util.Scanner;
public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  by creating private constructor ,you can not create an object of that class
	 Student s = new Student();
	 
	 String name="";
	 int UID=0;
		//Student s = new Student(4,"nisha","nisha@gmail.com");  //create object,constructor  is called automATICALLY
		
		System.out.println(s.toString());
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			System.out.println("Enter your name");	
			 name = br.readLine();
			 System.out.println("Enter your UID");
				//UID = sc.nextInt();
				
				UID =  Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		
		Student s1 = new Student(UID,name,"payal@gmail.com");
		System.out.println(s1.toString());
		
		
		
		s1.setUID(3);
		s1.setSfullname("payalnew");
		s1.setSemail("payalnew@gmail.com");
		
		
		System.out.println(s1.toString());
		
		
	}

}
