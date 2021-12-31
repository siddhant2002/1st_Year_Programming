import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		double a,deno;
		System.out.println("Enter the value of n and a");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("The harmonic motion is "+(n/(1/n)));
		}
	}
}
