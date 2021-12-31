import java.util.Scanner;

public class Number15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b;
		double r;
		System.out.println("Enter the length breadth and radius");
		l=sc.nextInt();
		b=sc.nextInt();
		r=sc.nextInt();
		area(l);
		area(l,b);
		area(r);
	}
	static void area(int l)
	{
		System.out.println("The area of square is "+(int)(Math.pow(l,2)));
	}
	static void area(int l,int b)
	{
		System.out.println("The area of the reactangle is "+(l*b));
	}
	static void area(double r)
	{
		System.out.println("The area of circle is "+(Math.PI*Math.pow(r,2)));
	}
}
