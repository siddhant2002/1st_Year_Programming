package Recursion_Programs;
import java.util.*;
public class Largest_Number_In_Array {

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
		System.out.println("The largest number in the array is "+(search(a,0,a[0])));
	}
	static int search(int a[] , int i , int k)
	{
		if(i==a.length)
			return k;
		else if(k<a[i])
		{
			k=a[i];
			return search(a,i+1,k);
		}
		else
			return search(a,i+1,k);
	}
}
