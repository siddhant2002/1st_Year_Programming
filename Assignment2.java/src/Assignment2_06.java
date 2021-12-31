import java.util.*;
public class Assignment2_06 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double w,p,i,h;
		System.out.println("Enter weight in pounds: ");
		p=sc.nextDouble();
		System.out.println("Enter height in inches: ");
		i=sc.nextDouble();
		h=0.0254*i;
		w=0.45359237*p;
		System.out.println("BMI is "+(w/(Math.pow(h,2))));
	}

}
