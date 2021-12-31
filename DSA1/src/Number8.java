import java.util.*;
public class Number8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int b[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("The dot product is ");
		int c[]=new int[n];
		for(i=0;i<n;i++)
		{
			c[i]=a[i]*b[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
