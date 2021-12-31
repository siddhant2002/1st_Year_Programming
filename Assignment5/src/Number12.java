import java.util.*;
public class Number12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,i,f,n,j;
		double s=1;
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			f=1;
			for(j=1;j<=i;j++)
			{
				f*=i;
			}
			s=s+(Math.pow(x,i))/f;
		}
		System.out.println("The sum is "+s);
	}

}
