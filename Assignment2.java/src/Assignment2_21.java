import java.util.*;
public class Assignment2_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		a=Double.parseDouble(args[0]);
		b=2.0*a;
		c=3.0*a;
		b=Math.toRadians(b);
		c=Math.toRadians(c);
		a=Math.sin(b)+Math.sin(c);
		System.out.println(a);
	}
}
