import java.util.*;
public class Methods3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		Fibonacci(n);
	}
	static void Fibonacci(int n)
	{
		int a=0,b=1,c,i;
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a+" "+b);
		else
		{
			System.out.print(a+" "+b+" ");
			for(i=3;i<=n;i++)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}
}
