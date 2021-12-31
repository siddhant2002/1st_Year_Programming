package Recursion_Programs;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The updated array is ");
		a=reverse(a,0);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static int[] reverse(int a[] , int i)
	{
		if(i==a.length/2)
			return a;
		else
		{
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
			return reverse(a,i+1);
		}
	}
}
