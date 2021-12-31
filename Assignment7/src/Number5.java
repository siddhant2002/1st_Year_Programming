import java.util.*;

public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		k=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>k)
				k=a[i];
		}
		for(k=k-1;k>=0;k--)
		{
			for(i=0;i<n;i++)
				if(k==a[i])
					break;
			if(i!=n)
				break;
		}
		System.out.println("The second highest number is "+k);
	}
}
