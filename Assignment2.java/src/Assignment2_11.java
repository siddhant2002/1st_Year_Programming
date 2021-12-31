import java.util.*;
public class Assignment2_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double ia,air,ny,ci;
		System.out.println("Enter investment amount: ");
		ia=sc.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		air=sc.nextDouble();
		System.out.println("Enter number of years: ");
		ny=sc.nextDouble();
		air=air/100.0;
		ci=ia*(Math.pow((1+air/12),(ny*12)));
		System.out.println("Accumulated value is: $"+ci);
	}

}
