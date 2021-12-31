package Recursion_Programs;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(factorial(n));
	}
	static int factorial(int n)
	{
		if(n<0)
			return -n;
		else if(n==0||n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}
