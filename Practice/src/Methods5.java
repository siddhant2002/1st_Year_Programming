import java.util.*;
public class Methods5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		reverse(n);
	}
	static void reverse(int n)
	{
		int d,dup,rev=0;
		dup=n;
		while(dup!=0)
		{
			d=dup%10;
			rev=rev*10+d;
			dup/=10;
		}
		System.out.println("The reverse of "+n+" is "+rev);
		
	}
}
