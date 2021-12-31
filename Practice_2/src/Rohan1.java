import java.util.*;
public class Rohan1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,m=0;
		System.out.println("Enter number of elements of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					break;
			}
			if(j==b.length)
			{
				b[m]=a[i];
				c[m++]=1;
			}
			else
				c[j]=c[j]+1;
		}
		System.out.println("The distinct characters are ");
		for(i=0;i<m;i++)
		{
			if(c[i]==1)
				System.out.print(b[i]+" ");
		}
	}
}
