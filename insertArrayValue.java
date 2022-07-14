import java.util.Scanner;


public class insertArrayValue {
	// Java program to remove an element
	// from a specific index from an array
		// Function to remove the element
		public static int[] removeTheElement(int[] arr, int index)
		{
			// If the array is empty
			// or the index is not in array range
			// return the original array
			if (arr == null || index < 0 || index >= arr.length) {
				return arr;
			}
			// Create another array of size one less
			int[] anotherArray = new int[arr.length ];
			// Copy the elements except the index
			// from original array to the other array
			for (int i = 0, k = 0; i < arr.length; i++) {
				// if the index is
				// the removal element index
				if (i == index) {
					continue;
				}
				// if the index is not
				// the removal element index
				anotherArray[i] = arr[i];
			}
			return anotherArray;
		}
		public static void main(String[] args){
			Scanner scan = new Scanner (System.in);
			System.out.println("enter the size of the array :");
			int a= scan.nextInt();
			int arr[]=new int[a+1];
			for(int i =0;i<a;i++){
				arr[i]=scan.nextInt();
			}
			
			System.out.println("enter the index of the element :");
			int in= scan.nextInt();		
			System.out.println("enter the value of the element :");
			int val= scan.nextInt();
			System.out.println("Index to be removed: " + in);
			arr = removeTheElement(arr, in);
			for(int i=0;i<a+1;i++){
				System.out.println(arr[i]);
			}
		}
	
}
