import java.util.*;
public class arrayValueInsert {

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
		System.out.println("enter the value of the element :");
		int val= scan.nextInt();
		int newArr[]=new int[a+1];
		for(int i=0;i<a+1;i++){
			if(i>=in){
				newArr[i+1]=arr[i];
			}else{
				newArr[i]=arr[i];
			}
		}
		for(int i =0;i<a+1;i++){
		System.out.println(newArr[i]);
		}
		

	}

}
