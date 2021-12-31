import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,c=0;
		System.out.println("Enter number of elements to be entered");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j]&&j>i)
					c++;
			}
		}
		System.out.println("Inversion count in the array is "+c);
	}
}
