import java.util.*;
public class deleteArrayByIndex {
		// Function to remove the element
		public static int[] removeTheElement(int[] arr, int index)
		{
			int[] anotherArray = new int[arr.length -1];

			for (int i = 0, k = 0; i < arr.length; i++) {
				if (i == index) {
					continue;
				}
				anotherArray[k++] = arr[i];
			}
			return anotherArray;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("enter the size of the array :");
			int a= scan.nextInt();
			int arr[]=new int[a+1];
			for(int i =0;i<a;i++){
				arr[i]=scan.nextInt();
			}
			
			System.out.println("enter the index of the element :");
			int in= scan.nextInt();		
			arr = removeTheElement(arr, in);
			System.out.println("Resultant Array: "+ Arrays.toString(arr));
		}
	

}
