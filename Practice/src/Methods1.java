import java.util.*;
public class Methods1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		boolean k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		k=Methods1.Checkspalindrome(n);
		if(k==true)
			System.out.println(n+" is a palindrome number");
		else
			System.out.println(n+" is not a palindrome number");
	}
	static boolean Checkspalindrome(int n)
	{
		int dup,d,rev=0;
		dup=n;
		while(dup!=0)
		{
			d=dup%10;
			rev=rev*10+d;
			dup/=10;
		}
		if(rev==n)
			return true;
		else
			return false;
	}
}
