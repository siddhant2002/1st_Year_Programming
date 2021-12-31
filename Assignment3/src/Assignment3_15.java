import java.util.*;
public class Assignment3_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,y,x1,y1;
		System.out.println("Enter the coordinates of the point");
		x=sc.nextDouble();
		y=sc.nextDouble();
		x1=Math.pow(x,2);
		y1=Math.pow(y,2);
		x1=x1+y1;
		if(Math.sqrt(x1)<=10.0)
		{
			System.out.println("Point ("+x+" , "+y+") is in the circle");
		}
		else
		{
			System.out.println("Point ("+x+" , "+y+" ) is not in the circle");
		}
	}

}
