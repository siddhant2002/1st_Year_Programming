import java.util.*;

public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(reverse(n));
	}
	static int k=0;
	static int reverse(int n)
	{
		if(n==0)
			return k;
		else
		{
			k=k*10+(n%10);
			return reverse(n/10);
		}
	}
}
