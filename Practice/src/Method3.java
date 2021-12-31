import java.util.*;
public class Method3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		Method3 nm=new Method3();
		int a=nm.vowelCount(s);
		System.out.println("Number of vowels is "+a);
	}
	int vowelCount(String s)
	{
		int i,l,c1=0;
		char c;
		l=s.length();
		s=s.toLowerCase();
		for(i=0;i<l;i++)
		{
			c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				c1++;
			}
		}
		return c1;
	}
}
