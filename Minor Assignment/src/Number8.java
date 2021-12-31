import java.util.*;
public class Number8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double dtd,fe,pog,tp;
		System.out.println("Enter distance to drive");
		dtd=sc.nextDouble();
		System.out.println("Enter fuel efficiency of the car");
		fe=sc.nextDouble();
		System.out.println("Enter the price per gallon");
		pog=sc.nextDouble();
		tp=(dtd/fe)*pog;
		System.out.println("The total cost of the trip is "+tp);
	}
}
