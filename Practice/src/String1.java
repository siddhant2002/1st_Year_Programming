import java.util.*;
public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,p="";
		int i,l;
		char c;
		System.out.println("Enter a string");
		s=sc.nextLine();
		s=s.trim();
		l=s.length();
		for(i=0;i<l;i++)
		{
			c=s.charAt(i);
			p=c+p;
		}
		if(s.equals(p)==true)
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
	}

}
