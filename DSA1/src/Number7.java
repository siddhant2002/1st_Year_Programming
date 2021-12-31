import java.util.*;
public class Number7 {

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
		Number7 nm=new Number7();
		nm.distinct(a);
	}
	void distinct(int a[])
	{
		int i=0,j=0,c=0;
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					if((a[i]*a[j])%2==1)
					{
						c=1;
						break;
					}
				}
			}
			if(c==1)
				break;
		}
		if(i==a.length-1)
		{
			System.out.println("No such distinct pairs found");
		}
		else
		{
			System.out.println("The distinct pairs are "+a[i]+" and "+a[j]+" and the sum is "+(a[i]*a[j]));
		}
	}
}
