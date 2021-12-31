import java.util.*;
public class Assignment3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,r1,r2;
		System.out.println("Enter the values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=Math.pow(b,2)-4*a*c;
		if(d>0)
		{
			r1=(-b+Math.pow(d,0.5))/(2*a);
			r2=(-b-Math.pow(d,0.5))/(2*a);
			System.out.println("The roots of the equation is "+r1+"  "+r2);
		}
		else if(d==0)
		{
			System.out.println("The root of the equation is "+(-b/2*a));
		}
		else
		{
			System.out.println("The equation has no roots");
		}
	}
}
