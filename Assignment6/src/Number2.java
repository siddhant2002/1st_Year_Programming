import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("The pentagonal number is "+getPentagonalNumber(n));
	}
	static int getPentagonalNumber(int n)
	{
		return (n*(3*n-1))/2;
	}
}
