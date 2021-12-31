import java.util.*;
public class Assignment2_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,e;
		a=Math.random();
		b=Math.random();
		c=Math.random();
		d=Math.random();
		e=Math.random();
		System.out.println("The first number is "+a);
		System.out.println("The second number is "+b);
		System.out.println("The third number is "+c);
		System.out.println("The fourth number is "+d);
		System.out.println("The fifth number is "+e);
		System.out.println("The average value is "+((a+b+c+d+e)/5.0));
		System.out.println("The minimum value is "+(Math.min(a,(Math.min(b,(Math.min(c,(Math.min(d,e)))))))));
		System.out.println("The maximum value is "+(Math.max(a,(Math.max(b,(Math.max(c,(Math.max(d,e)))))))));
	}
}

