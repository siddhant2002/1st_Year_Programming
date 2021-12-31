import java.util.*;
public class Number11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		char a;
		System.out.println("Enter a string");
		s=sc.nextLine();
		System.out.println("Enter a character ");
		a=sc.next().charAt(0);
		System.out.println("Number of "+a+"'s present in "+s+" string is "+count(s,a));
	}
	static int count(String str,char a)
	{
		int i,l,c=0;
		l=str.length();
		for(i=0;i<l;i++)
		{
			if(a==str.charAt(i))
				c++;
		}
		return c;
	}
}
