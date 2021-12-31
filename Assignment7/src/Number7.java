import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("The "+a[i]+" form in octal is "+octal(a[i]));
		}
	}
	static String octal(int n)
	{
		String s="",p="";
		int d;
		while(n!=0)
		{
			d=n%8;
			s=s+d;
			n/=8;
		}
		for(d=0;d<s.length();d++)
		{
			p=s.charAt(d)+p;
		}
		return p;
	}
}
