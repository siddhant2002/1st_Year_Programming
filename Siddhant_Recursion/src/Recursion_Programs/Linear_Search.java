package Recursion_Programs;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number to be searched");
		k=sc.nextInt();
		if(check(a,0,k))
			System.out.println("The element has been found");
		else
			System.out.println("The element has not been found");
	}
	static boolean check(int a[] , int i , int k)
	{
		if(a.length==i)
			return false;
		else if(k==a[i])
			return true;
		else
			return check(a,i+1,k);
	}
}
