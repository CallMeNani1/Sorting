import java.util.Arrays;
public class Bubble_Sort {


				  // perform the bubble sort
			static void bubbleSort(int array[]) {
			int size = array.length;
				    
				    // loop to access each array element
			for (int i = 0; i < size - 1; i++)
				    
				      // loop to compare array elements
			for (int j = 0; j < size - i - 1; j++)

				        // compare two adjacent elements
			if (array[j] > array[j + 1]) {   // change > symbol for descending order

				          // swapping occurs if elements are not in the intended order
			int temp = array[j];
			array[j] = array[j + 1];
			array[j + 1] = temp;
				        }
				  }

			public static void main(String args[]) {
				      
			int[] data = { 1,2,3,4,5 };
				    
				    // call method using class name
			Bubble_Sort.bubbleSort(data);
				    
			System.out.print("Ascending Order: ");
			System.out.println(Arrays.toString(data));
			
				  }
			
				}