import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The sum of two numbers is "+add(a,b));
	}
	static int add(int a, int b)
	{
		if(b==0)
			return a;
		else
			return add(a^b,a&b<<1);
	}
}
