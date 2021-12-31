import java.util.*;
public class Method1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=add(a,b);
		//char c1=sc.next().charAt(0);
		System.out.println("The sum is "+c);
	}
	public static int add(int a,int b)
	{
		int z;
		z=a+b;
		return z;
	}
}
