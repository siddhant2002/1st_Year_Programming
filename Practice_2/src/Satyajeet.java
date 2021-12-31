import java.util.*;
public class Satyajeet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n;
		System.out.println("Enter two numbers ");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println(fun(m,n));
	}
	static int fun(int m , int n)
	{
		if(m<n)
			return 0;
		if(n==0)
			return 1;
		else
		{
			return fun(m-1,n)+fun(m/2,n-1);
		}
	}
}
