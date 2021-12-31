import java.util.Scanner;

public class Number12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		System.out.println("Number of vowels present in "+s+" is "+count(s));
	}
	static int count(String str)
	{
		int i,l,c=0;
		char c1;
		l=str.length();
		str=str.toLowerCase();
		for(i=0;i<l;i++)
		{
			c1=str.charAt(i);
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
				c++;
		}
		return c;
	}

}
