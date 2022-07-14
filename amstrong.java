import java.util.*;
public class amstrong {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter an ams num :");
		int a=scan.nextInt();
		int c=0,sum=0;
		int q=a;
		while(q>0){
			c=q%10;
			sum+=c*c*c;
			q=q/10;
		}
		if(a==sum){
		System.out.println(sum+" is an amstrong number ");
		}else{
			System.out.println("the given number is not an amstrong number ");
		}

	}

}
