import java.util.*;
public class Assignment2_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l;
		double radius;
		System.out.println("Enter the radius and length of a cylinder");
		radius=sc.nextDouble();
		l=sc.nextInt();
		System.out.println("The area is "+(radius*radius*Math.PI));
		double area=radius*radius*Math.PI;
		System.out.println("The volume is "+(l*area));
	}

}
