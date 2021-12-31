import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		k=reverse(n);
	}
	static int reverse(int number)
	{
		int d,rev=0,dup;
		boolean k;
		dup=number;
		while(dup!=0)
		{
			d=dup%10;
			rev=rev*10+d;
			dup/=10;
		}
		k=isPalindrome(number);
		if(k==true)
			System.out.println(number+" is a palindrome number");
		else
			System.out.println(number+" is not a palindrome number");
		return number;
	}
	static boolean isPalindrome(int number)
	{
		int d,rev=0,dup;
		dup=number;
		while(dup!=0)
		{
			d=dup%10;
			rev=rev*10+d;
			dup/=10;
		}
		if(rev==number)
			return true;
		else
			return false;
	}
}
