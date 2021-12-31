import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,h,j,mid,f=0;
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
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					h=a[j];
					a[j]=a[j+1];
					a[j+1]=h;
				}
			}
		}
		System.out.println("Enter a number which is to be searched");
		h=sc.nextInt();
		i=0;
		j=n-1;
		while(i<j)
		{
			mid=(i+j)/2;
			if(h>a[mid])
				i=mid+1;
			else if(h<a[mid])
				j=mid-1;
			else if(h==a[mid])
			{
				f=1;
				break;
			}
		}
		if(f==1)
		System.out.println("Number is found");
		else
			System.out.println("Number not found");
	}
}
