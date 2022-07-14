import java.util.*;
public class swapTwoNum {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the first num: ");
		int a=scan.nextInt();
		System.out.println("enter the second num: ");
		int b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of a "+a);
		System.out.println("the value of b "+b);

		
	}

}
