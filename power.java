import java.util.*;
public class power {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter an number:");
		
		int a=scan.nextInt();
		System.out.println("enter the power value:");
		int p=scan.nextInt();
		int result=1;
	    while (p != 0) {
	        result *= a;
	        --p;
	    }
		System.out.println("the power of "+result);
	}

}
