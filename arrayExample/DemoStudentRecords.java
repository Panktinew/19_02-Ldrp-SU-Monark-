package arrayExample;

import java.util.Scanner;

public class DemoStudentRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] s = new Student[5]; ///declare

		
		//new memory to each element of array
		for(int i =0;i<s.length;i++) {
			
			s[i] = new Student();
		}
		
		Scanner sc = new Scanner(System.in);
	
		for(int i =0;i<s.length;i++) {

			 int j = i+1;
			s[i].setRollNo(j);

			
			System.out.println("Enter name");
			String name = sc.nextLine();
			s[i].setName(name);
					
		
	}
	
		for(int i =0;i<s.length;i++) {
			 
			 System.out.println("Rolla number:" +  s[i].getRollNo() + "name: " +s[i].getName() );
				
			
			
		
	}
	
	}
}
