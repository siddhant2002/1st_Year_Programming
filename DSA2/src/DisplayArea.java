import java.util.Scanner;

public abstract class DisplayArea {

	public static void main(String[] args) {
		Shape nm=new Triangle();
		nm.calculate();
		Shape kk=new Square();
		kk.calculate();
		Shape k=new Circle();
		k.calculate();
	}
}
	abstract class Shape 
	{
		public abstract void calculate();
	}
	class Triangle extends Shape
	{
		public void calculate()
		{
			Scanner sc=new Scanner(System.in);
			double b,h;
			System.out.println("Enter the base and the height of the triangle");
			b=sc.nextDouble();
			h=sc.nextDouble();
			System.out.println("The area of the triangle is "+(0.5*b*h));
		}
	}
	class Square extends Shape
	{
		public void calculate()
		{
			Scanner sc=new Scanner(System.in);
			double s;
			System.out.println("Enter the side of a square");
			s=sc.nextDouble();
			System.out.println("The area of the square is "+(s*s));
		}
	}
	class Circle extends Shape
	{
		public void calculate()
		{
			Scanner sc=new Scanner(System.in);
			double r;
			System.out.println("Enter a radius");
			r=sc.nextDouble();
			System.out.println("The area of the circle is "+(Math.PI*(Math.pow(r,2))));
		}
	}
