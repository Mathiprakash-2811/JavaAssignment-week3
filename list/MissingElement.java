package list;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		   int[] array = {1, 2, 3, 4, 10, 6, 8};
	        
	       
	        Arrays.sort(array);

	      
	        for (int i = 0; i < array.length-1; i++) {
	            
	            if (array[i + 1] - array[i] > 1) {
	             
	                for (int j = array[i] + 1; j < array[i + 1]; j++) {
	                    System.out.print(j + " ");
	                }
	            }
	        }
	}

}
