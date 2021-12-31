import java.util.*;
public class Methods4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		k=decToBin(n);
		System.out.println("the binary equivalent of "+n+" is "+k);
	}
	static int decToBin(int n)
	{
		int i,d;
		String p="",q="";
		while(n!=0)
		{
			d=n%2;
			p=p+d;
			n/=2;
		}
		for(i=0;i<p.length();i++)
		{
			q=p.charAt(i)+q;
		}
		return Integer.parseInt(q);
	}
}
