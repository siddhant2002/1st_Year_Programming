import java.util.*;
public class Number11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p1,p2;
		Number11 k1=null;
		System.out.println("Enter two points");
		p1=sc.nextDouble();
		p2=sc.nextDouble();
		Number11 nm=new Number11();
		Number11 kk=new Number11();
		nm.setPoint(p1,p2);
		System.out.println("Enter two points");
		p1=sc.nextDouble();
		p2=sc.nextDouble();
		kk.setPoint(p1,p2);
		k1=nm.findDistance(nm,kk);
		k1.display();
	}
	double x,y;
	void setPoint(double a, double b)
	{
		x=a;
		y=b;
	}
	Number11 findDistance(Number11 p, Number11 p1)
	{
		Number11 k=new Number11();
		k.x=p1.x-p.x;
		k.y=p1.y-p.y;
		k.x=k.x*k.x;
		k.y=k.y*k.y;
		return k;
	}
	void display()
	{
		x=x+y;
		y=Math.sqrt(x);
		System.out.println("The distance between two points is "+y+" units");
	}
}
