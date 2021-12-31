import java.util.*;
public class Assignment2_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double s;
		System.out.println("Enter the side: ");
		s=sc.nextDouble();
		System.out.println("The area of the hexagon is "+(Math.sqrt(3)*3*Math.pow(s,2))/2);
	}
}
