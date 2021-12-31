import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements to be inserted ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		if(n%2==1)
		{
			for(i=0;i<n-1;i+=2)
			{
				System.out.print(a[i+1]+" "+a[i]+" ");
			}
			System.out.println(a[n-1]);
		}
		else
		{
			for(i=0;i<n;i+=2)
			{
				System.out.print(a[i+1]+" "+a[i]+" ");
			}
		}
	}
}
