import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		boolean k;
		System.out.println("Enter a number");
		n=sc.nextInt();
		k=isOdd(n);
		if(k)
			System.out.println("Odd number");
		else
			System.out.println("Even number");
	}
	static boolean isOdd(int n)
	{
		if((n^1)!=(n+1))
			return true;
		else
			return false;
	}
}
