import java.util.*;
public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Largest(a,a[0],1));
	}
	static int Largest(int a[] , int n , int i)
	{
		if(i==a.length)
			return n;
		else
		{
			if(n<a[i])
				n=a[i];
			return Largest(a,n,i+1);
		}
	}
}
