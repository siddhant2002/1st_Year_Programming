import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int i,n,rev=0,dup;
		System.out.println("Enter a string");
		s=sc.nextLine();
		s=s.trim();
		n=Integer.parseInt(s);
		dup=n;
		while(dup!=0)
		{
			rev=rev*10+(dup%10);
			dup/=10;
		}
		if(rev==n)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome number");
		}
	}
}
