import java.util.*;

public class Assignment3_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,e,f,deno;
		System.out.println("Enter the values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		e=sc.nextDouble();
		f=sc.nextDouble();
		deno=(a*d)-(b*c);
		if(deno!=0)
		{
			System.out.println("X is "+(((e*d)-(b*f))/deno)+" Y is "+(((a*f)-(e*c))/deno));
		}
		else
		{
			System.out.println("It has no roots.");
		}
	}
}
