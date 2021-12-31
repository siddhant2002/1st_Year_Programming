import java.util.*;
public class Number12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,q;
		System.out.println("Enter a number");
		n=sc.nextInt();
		q=n/2;
		q*=2;
		if(q==n)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
