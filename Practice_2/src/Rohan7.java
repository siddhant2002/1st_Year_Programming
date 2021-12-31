import java.util.*;
public class Rohan7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k,t;
		String s="";
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(k=n;k>1;k--)
		{
			s=s+k;
			System.out.print(s);
			for(t=s.length();t<(2*n)-(1+s.length());t++)
			{
				System.out.print(k);
			}
			StringBuffer nm=new StringBuffer();
			nm.append(s);
			nm.reverse();
			System.out.print(nm.toString());
			System.out.println();
		}
		StringBuffer nm=new StringBuffer();
		nm.append(s);
		nm.reverse();
		System.out.println(s+k+nm.toString());
		for(k=2;k<=n;k++)
		{
			System.out.print(s);
			for(t=s.length();t<(2*n)-(1+s.length());t++)
			{
				System.out.print(k);
			}
			StringBuffer kk=new StringBuffer();
			kk.append(s);
			kk.reverse();
			System.out.print(kk.toString());
			System.out.println();
			s=s.substring(0,s.length()-1);
		}
	}
}
