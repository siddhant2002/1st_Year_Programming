import java.util.*;
public class P_C {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		getPermu(a);
	}
	static void getPermu(int ar[])
	{
		calPermu(ar,0);
	}
	static void calPermu(int a[] , int p)
	{
		int i,t;
		if(p>=a.length-1)
		{
			for(i=0;i<a.length-1;i++)
				System.out.print(a[i]);
			if(a.length>0)
				System.out.println(a[a.length-1]);
			return;
		}
		for(i=0;i<a.length;i++)
		{
			t=a[p];
			a[p]=a[i];
			a[i]=t;
			calPermu(a,p+1);
			t=a[p];
			a[p]=a[i];
			a[i]=t;
		}
	}
}
