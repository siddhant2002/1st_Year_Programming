import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("The addition is "+additionSimple(x,y));
		System.out.println("The subtraction is "+subtractionSimple(x,y));
		System.out.println("The multiplication is "+multiplicationSimple(x,y));
		System.out.println("The division is "+divisionSimple(x,y));
		System.out.println("The remainder is "+remainderSimple(x,y));
		System.out.println("The squareroot is "+squarerootSimple(x));
	}
	static int additionSimple(int x,int y)
	{
		return x+y;
	}
	static int subtractionSimple(int x,int y)
	{
		return x-y;
	}
	static int multiplicationSimple(int x,int y)
	{
		return x*y;
	}
	static double divisionSimple(int x,int y)
	{
		return x/y;
	}
	static int remainderSimple(int x,int y)
	{
		return x%y;
	}
	static double squarerootSimple(int n)
	{
		return Math.sqrt(n);
	}
}
