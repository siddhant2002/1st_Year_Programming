import java.util.Scanner;

public class Number13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		if(isPalindrome(s)==true)
			System.out.println("Palindrome string");
		else
			System.out.println("Not palindrome string");
	}
	static boolean isPalindrome(String s)
	{
		int i,l;
		char c;
		String p="";
		l=s.length();
		for(i=0;i<l;i++)
		{
			c=s.charAt(i);
			p=c+p;
		}
		if(s.equals(p)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
