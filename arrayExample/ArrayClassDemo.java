package arrayExample;
import java.util.*;
public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get the Array
				int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };
				
				
				int[] test = Arrays.copyOf(intArr, intArr.length);
				
				System.out.println("Array is test : "+Arrays.toString(test));
				System.out.println(intArr);
				
				
				// To print the elements in one line
				System.out.println("Array is : "+Arrays.toString(intArr));
				
				
				
				
				String[] str = {"gg","bb","cc","dd"};
				System.out.println(Arrays.toString(str));
				
				Arrays.sort(intArr);
				
				System.out.println("-----------------After Sorting---------------");
				System.out.println("Array is : "+Arrays.toString(intArr));

				int intKey = 22;

				// Print the key and corresponding index
				// Array must be sorted in ascending order for the binary search
				System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

				System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

				
				System.out.println("First Array : " + Arrays.toString(intArr));
				
				//Get the second Array
				int intArr1[] = { 10, 20, 15, 22, 35, 18 , 14 };
				System.out.println("Second Array : " + Arrays.toString(intArr1));

				Arrays.sort(intArr1);
				// To compare both arrays
				if (Arrays.equals(intArr, intArr1))
					System.out.println("Both arrays are equal");
				else
					System.out.println("Arrays are not equal");

				//creates a new array with a specified length, 
				System.out.println("\nNew Arrays by copyOf:\n");
			
				int intArr2[]=Arrays.copyOf(intArr, 10);
				
				System.out.println("Integer Array: " + Arrays.toString(intArr2));

				System.out.println("\nNew Arrays by copyOfRange:");
				// To copy the array into an array of new length
				int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
				System.out.println("Integer Array: " + Arrays.toString(intArr3));

				// To fill the arrays with key 22
			
				int[] arr = {12,45,67,22};
				
				
				System.out.println("Integer Array on filling 22: " + Arrays.toString(arr));

				Arrays.fill(arr,0);
			
				System.out.println("Integer Array on filling 22: " + Arrays.toString(arr));



	}

}
