package Recursion_Programs;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}
