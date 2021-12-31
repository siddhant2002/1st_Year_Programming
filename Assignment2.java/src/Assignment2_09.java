import java.util.*;
import java.lang.*;
public class Assignment2_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,x2,y1,y2,d,d1;
		System.out.println("Enter x1 and y1: ");
		System.out.println("Enter x2 and y2: ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		d=x2-x1;
		d1=y2-y1;
		d=d*d;
		d1=d1*d1;
		d=d+d1;
		System.out.println("The distance between the two points: "+Math.sqrt(d));
	}

}
