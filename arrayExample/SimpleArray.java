package arrayExample;
import java.util.Arrays;
public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		int [] arr = new int[10];
        float arr1[] = new float[10];
        
        
        //ini
        
        arr[0] = 34;
        arr[1] = 56;
        arr[2]=78;
        
        
        int[] arr2= new int[] {46,67,89,90};
        
        
        for(int i=0;i<arr2.length;i++) {
        //	System.out.println(arr2[i]);
        }
        
        for (int k : arr) {
        	System.out.print(k + " ");	
        }
        
        
        
        System.out.println(Arrays.toString(arr2));
        
	}

}
