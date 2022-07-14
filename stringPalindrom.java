import java.util.*;
public class stringPalindrom {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("enter an string :");
		String input= scan.next();
		String q=input;
		String rev="";
		for(int i=input.length()-1;i>=0;i--){
			rev=rev+input.charAt(i);
		}
		System.out.println(q);
		if (q.equals(rev)){
		System.out.println("the string is an palindrom : "+rev);
		}else{
		System.out.println("the string is not an palindrom : "+rev);

		}

	}

}
