package Recursion_Programs;
import java.util.Scanner;
public class Number_Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,n;
		System.out.println("Enter the base and the power");
		x=sc.nextInt();
		n=sc.nextInt();
		System.out.println(exp(x,n));
	}
	static int exp(int x, int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return x;
		else
			return x*exp(x,n-1);
	}
}
