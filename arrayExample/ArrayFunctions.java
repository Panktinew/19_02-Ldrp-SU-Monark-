package arrayExample;

public class ArrayFunctions {
	//  print array
	public static void printData(int[] arr) {
		
		
		for(int k:arr) {
			System.out.println(k);
		}
		
	}
	
	//variable length argument
public static void getSum(int ... n) {
	
	int s1 = 0;
	
	for(int k : n) {
		s1 = s1 + k;
	}
	
	System.out.println("total = "+s1);
	
	
}


	
	
}
