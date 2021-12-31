import java.util.*;
public class Number2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k,i,m=0,i1;
		System.out.println("How many number are you going to enter");
		k=sc.nextInt();
		int a[]=new int[k];
		int b[]=new int[k];
		System.out.println("Enter integers between 1 and 100:");
		for(i1=1;i1<=k;i1++)
		{
			n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			else
			{
				for(i=0;i<m;i++)
				{
					if(n==a[i])
						break;
				}
				if(i==m)
				{
					a[m]=n;
					b[m++]=1;
				}
				else
				{
					b[i]=b[i]+1;
				}
			}
		}
		for(i=0;i<m;i++)
		{
			if(b[i]>1)
				System.out.println(a[i]+" is present "+b[i]+" times");
			else
					System.out.println(a[i]+" is present 1 time");
		}
	}

}
