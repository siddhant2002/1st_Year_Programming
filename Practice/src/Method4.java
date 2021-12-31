import java.util.*;
public class Method4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Summation(a,n);
	}
	static void Summation(int a[], int n)
	{
		int s=0,i;
		for(i=0;i<n;i++)
		{
			s+=a[i];
		}
		System.out.println("The sum of the array is "+s);
	}
}
