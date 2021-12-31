import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,n,m,ch;
		System.out.println("Enter number of columns and rows of the array");
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter "+(n*m)+" numbers");
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		System.out.println("Press 1 for sorting array in ascending order and Press 2 for sorting array in descending order");
		ch=sc.nextInt();
		if(ch==1)
		{
			as(a,n,m);
			display(a,n,m);
		}
		else if(ch==2)
		{
			de(a,n,m);
			display(a,n,m);
		}
		else
			System.out.println("Invalid choice");
	}
	static void as(int a[][], int n, int m)
	{
		int b[]=new int[n*m];
		int r,c,i=0,d;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				b[i++]=a[r][c];
			}
		}
		for(r=0;r<i-1;r++)
		{
			for(c=0;c<i-r-1;c++)
			{
				if(b[c]>b[c+1])
				{
					d=b[c];
					b[c]=b[c+1];
					b[c+1]=d;
				}
			}
		}
		i=0;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				a[r][c]=b[i++];
			}
		}
	}
	static void de(int a[][], int n, int m)
	{
		int b[]=new int[n*m];
		int r,c,i=0,d;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				b[i++]=a[r][c];
			}
		}
		for(r=0;r<i-1;r++)
		{
			for(c=0;c<i-r-1;c++)
			{
				if(b[c]<b[c+1])
				{
					d=b[c];
					b[c]=b[c+1];
					b[c+1]=d;
				}
			}
		}
		i=0;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				a[r][c]=b[i++];
			}
		}
	}
	static void display(int a[][], int n, int m)
	{
		int r,c;
		for(r=0;r<n;r++)
		{
			for(c=0;c<m;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}
