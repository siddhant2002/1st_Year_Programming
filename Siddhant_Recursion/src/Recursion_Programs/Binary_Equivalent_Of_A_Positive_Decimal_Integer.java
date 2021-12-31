package Recursion_Programs;
import java.util.Scanner;
public class Binary_Equivalent_Of_A_Positive_Decimal_Integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		StringBuilder k=new StringBuilder();
		k.append(binary(n));
		System.out.println(k.reverse());
	}
	static String k="";
	static String binary(int n)
	{
		if(n==0)
			return k;
		else
		{
			k=k+n%2;
			return binary(n/2);
		}
	}
}