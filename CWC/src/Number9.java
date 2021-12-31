import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k,p,m=0;
		System.out.println("Enter the integer array length");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		p=a[0]*a[1]*a[2];
		for(i=0;i<n-2;i++)
		{
			for(j=i+1;j<n-1;j++)
			{
				for(k=j+1;k<n;k++)
				{
					m=0;
					m=a[i]*a[j]*a[k];
					if(m>p)
						p=m;
				}
			}
		}
		System.out.println("The highest product combination is "+p);
	}
}
