import java.util.*;
public class palindrom {
	public static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int n=scan.nextInt();
		int e=n;
		int rev=0,rem=0;
		while(n!=0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(e==rev){
		System.out.println("the given num is an palendron");
		}else{
			System.out.println("the given num is not an palendron");
		}
	}

}
