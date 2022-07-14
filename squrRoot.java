import java.util.*;
public class squrRoot {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter an number to find square root :");
		int squ=scan.nextInt();
		float ans=squ/2;
		float q=0;
		while(ans!=0){
			q=ans*ans;
			if(q==squ){
				System.out.println(ans);
				break;
			}else{
				ans--;
			}
		}
		

	}

}
