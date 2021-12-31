import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,i,j,i1,j1,dup;
		System.out.println("Enter the number of rows and columns");
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter "+(n*m)+" numbers");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[]=new int[n];
		int c[]=new int[m];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[j]=a[j][i];
			}
			for(i1=0;i1<n-1;i1++)
			{
				for(j1=0;j1<n-1-i1;j1++)
				{
					if(b[j1]>b[j1+1])
					{
						dup=b[j1];
						b[j1]=b[j1+1];
						b[j1+1]=dup;
					}
				}
			}
			for(j=0;j<n;j++)
			{
				a[j][i]=b[j];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[j]=a[i][j];
			}
			for(i1=0;i1<m-1;i1++)
			{
				for(j1=0;j1<m-1-i1;j1++)
				{
					if(c[j1]>c[j1+1])
					{
						dup=c[j1];
						c[j1]=c[j1+1];
						c[j1+1]=dup;
					}
				}
			}
			for(j=0;j<m;j++)
			{
				a[i][j]=c[j];
			}
		}
		System.out.println("The sorted array is ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
