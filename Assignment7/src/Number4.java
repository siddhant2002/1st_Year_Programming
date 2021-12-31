import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements ");
		n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("The smallest number is "+min(a));
	}
	public static double min(double[] array)
	{
		double k=array[0];
		int i;
		for(i=1;i<array.length;i++)
		{
			if(array[i]<i)
				k=array[i];
		}
		return k;
	}
}
