import java.util.*;
public class Number8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		double s,ar;
		System.out.println("Enter the number of sides: ");
		n=sc.nextInt();
		System.out.println("Enter the length of the side: ");
		s=sc.nextDouble();
		System.out.println("The area of the regular hexagon is "+area(n,s));
	}
	static double area(int n, double side)
	{
		double s,k;
		k=(Math.PI/n);
		s=(n*Math.pow(side,2))/(4*Math.tan(k));
		return s;
	}
}
