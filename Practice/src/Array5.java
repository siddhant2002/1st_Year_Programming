import java.util.*;

public class Array5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,max,pmax,dup;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			max=a[i];
			pmax=i;
			for(j=i+1;j<n;j++)
			{
				if(max>a[j])
				{
					max=a[j];
					pmax=j;
				}
			}
			dup=a[i];
			a[i]=a[pmax];
			a[pmax]=dup;
		}
		System.out.println("The sorted array is ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
