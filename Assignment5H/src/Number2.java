import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,n,i;
		double s=0;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			s=s+Math.pow(a,2);
		}
		System.out.println("The sum is "+s);
	}
}
