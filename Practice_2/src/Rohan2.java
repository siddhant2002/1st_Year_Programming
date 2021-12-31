import java.util.*;
public class Rohan2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter number of elements of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The distinct characters are ");
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					continue;
				if(a[i]==a[j])
					break;
			}
			if(j==n)
				System.out.print(a[i]+" ");
		}
	}
}
