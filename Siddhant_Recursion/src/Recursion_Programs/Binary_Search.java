package Recursion_Programs;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,p;
		System.out.println("Enter the elements to be inserted");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the number to be searched");
		p=sc.nextInt();
		n=search(a,p,0,a.length);
		if(n==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in "+(n+1)+"th position");
	}
	static int search(int a[] , int n , int i , int j)
	{
		if(i>j)
			return -1;
		int mid=(i+j)/2;
		if(n>a[mid])
			return search(a,n,mid+1,j);
		else if(a[mid]>n)
			return search(a,n,i,mid-1);
		else if(n==a[mid])
			return mid;
		else
			return search(a,n,i,j);
	}
}