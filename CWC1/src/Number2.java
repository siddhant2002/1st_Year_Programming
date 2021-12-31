import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements to be inserted in the 1st Array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter number of elements to be inserted in the 2nd Array");
		n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		Arrays.sort(a1);
		System.out.println("The product is "+(a[0]*a1[n-1]));
	}
}
