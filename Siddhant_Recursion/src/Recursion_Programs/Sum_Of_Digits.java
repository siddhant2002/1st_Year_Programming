package Recursion_Programs;
import java.util.*;
public class Sum_Of_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("The sum of the digits of "+n+" is "+sum(n));
	}
	static int k=0;
	static int sum(int n)
	{
		if(n==0)
			return k;
		else
		{
			k=k+(n%10);
			return sum(n/10);
		}
	}
}
