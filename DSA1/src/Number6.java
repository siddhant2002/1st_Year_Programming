import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements of the array ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Number6 nm=new Number6();
		nm.smallLarge(a);
	}
	void smallLarge(int a[])
	{
		int i,j,dup;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					dup=a[j];
					a[j]=a[j+1];
					a[j+1]=dup;
				}
			}
		}
		System.out.println("The smallest number is "+a[0]);
		System.out.println("The greatest number is "+a[a.length-1]);
	}
}
