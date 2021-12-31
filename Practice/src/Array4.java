import java.util.*;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,h,j;
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
		System.out.println("The sorted array is ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		int a2[]=new int[7];
		for(int i4=0;i4<7;i4++)
		{
			a2[i4]=sc.nextInt();
		}
		int y,z;
		int b[]=new int[7];
		for(y=0,z=a2.length-1;z>=0;z--,y++)
		{
			b[y]=a2[z];
		}
		for(int k:b)
		{
			System.out.println(b[k]);
			k++;
		}
	}

}
