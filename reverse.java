import java.util.Scanner;
public class reverse {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("enter the size of the array :");
		int n = scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}			
		System.out.println("the reversed array :");
		for(int i=n-1;i>=0;i--){
			System.out.println(a[i]);
		}
	}
}