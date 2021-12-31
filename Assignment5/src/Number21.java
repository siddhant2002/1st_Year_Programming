import java.util.*;
public class Number21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,i,gcd=0;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b&&a%b==0)
		{
			System.out.println("The GCD of "+a+" and "+b+" is "+b);
		}
		else if(b>a&&b%a==0)
		{
			System.out.println("The GCD of "+a+" and "+b+" is "+a);
		}
		else if(a>b&&a%b!=0)
		{
			for(i=1;i<=b;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}
			}
			System.out.println("The GCD of "+a+" and "+b+" is "+gcd);	
		}
		else if(b>a&&b%a!=0)
		{
			for(i=1;i<=a;i++)
			{
				if(a%i==0&&b%i==0)
				{
					gcd=i;
				}
			}
			System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
		}
	}

}
