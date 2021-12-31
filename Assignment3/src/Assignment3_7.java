import java.util.*;
public class Assignment3_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("Enter two points");
		a=sc.nextDouble();
		b=sc.nextDouble();
		if(a==0&&b!=0)
		{
			System.out.println("("+a+" , "+b+")"+" is on the Y-axis.");
		}
		else if(b==0&&a!=0)
		{
			System.out.println("("+a+" , "+b+")"+" is on the X-axis.");
		}
		else if(a>0&&b>0)
		{
			System.out.println("("+a+" , "+b+")"+" is in quadrant I.");
		}
		else if(a<0&&b<0)
		{
			System.out.println("("+a+" , "+b+")"+" is in quadrant III.");
		}
		else if(a>0&&b<0)
		{
			System.out.println("("+a+" , "+b+")"+" is in quadrant IV.");
		}
		else if(a<0&&b>0)
		{
			System.out.println("("+a+" , "+b+")"+" is in quadrant II.");
		}
	}
}
