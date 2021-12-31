import java.util.*;
public class Methods2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		k=Factorial(n);
		System.out.println("The factorial of "+n+" is "+k);
	}
	static int Factorial(int n)
	{
		int i,f=1;
		if(n==0)
			return 1;
		else
		{
			for(i=1;i<=n;i++)
			{
				f*=i;
			}
			return f;
		}
	}
}
