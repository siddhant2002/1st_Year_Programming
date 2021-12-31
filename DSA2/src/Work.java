import java.util.*;
public class Work {

	public static void main(String[] args) {
		CircleType nm=new CircleType();
		nm.input();
	}
}
	class PointType
	{
		Scanner sc=new Scanner(System.in);
		double r,x,y;
		PointType()
		{
			
		}
		PointType(double h, double k, double rad)
		{
			x=h;
			y=k;
			r=rad;
		}
		void pointShow()
		{
			if(x==0&&y==0)
				System.out.println("The point lies on the origin");
			else if(x>0&&y>0)
				System.out.println("The point lies on the 1st quadrant");
			else if(x>0&&y<0)
				System.out.println("The point lies on the 4th quadrant");
			else if(x<0&&y>0)
				System.out.println("The point lies on the 2nd quadrant");
			else if(x<0&&y<0)
				System.out.println("The point lies on the 3rd quadrant");
			System.out.println();
			System.out.println("The coordinates of the point are "+x+" "+y);
		}
		void pointCoordinates()
		{
			System.out.println();
			System.out.println("The coordinates are "+x+" "+y);
		}
		void calculateArea()
		{
			System.out.println();
			System.out.println("The area of the circle is "+(Math.PI*Math.pow(r,2)));
		}
		void calculateCircumference()
		{
			System.out.println();
			System.out.println("The circumference of the circle is "+(2*Math.PI*r));
		}
	}
	class CircleType extends PointType
	{
		double r,h,k;
		CircleType()
		{
			r=0;
			h=0;
			k=0;
		}
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius");
			r=sc.nextDouble();
			System.out.println("Enter the centre of the circle");
			h=sc.nextDouble();
			k=sc.nextDouble();
			PointType nm=new PointType(h,k,r);
			nm.pointShow();
			nm.pointCoordinates();
			nm.calculateArea();
			nm.calculateCircumference();
		}
	}
