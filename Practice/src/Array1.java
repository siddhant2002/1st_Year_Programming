import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,h;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		h=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>h)
				h=a[i];
		}
		System.out.println("The highest number is "+h);
	}
}
