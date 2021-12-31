import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double s=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Enter "+n+" random numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=Math.random();
			s+=a[i];
		}
		System.out.println("The average is "+s/i);
	}

}
