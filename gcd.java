import java.util.*;
public class gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=scan.nextInt();
		System.out.println("enter the value of b:");
		int b=scan.nextInt();
		if(a>b){
			int div=b;
			while(1==1){
			if(a%div==0&&b%div==0){
				System.out.println("the gcd of "+a+" and "+b+" is "+div);
				break;
			}else{
				div--;
			}
			}
		}
		if(b>a){
			int div=a;
			while(1==1){
			if(a%div==0&&b%div==0){
				System.out.println("the gcd of "+a+" and "+b+" is "+div);
				break;
			}else{
				div--;
			}
			}
		}
	}

}
