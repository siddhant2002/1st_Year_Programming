import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double aow,it,ft,te;
		System.out.println("Enter the amount of waters in kilograms ");
		aow=sc.nextDouble();
		System.out.println("Enter the initial and final temperature ");
		it=sc.nextDouble();
		ft=sc.nextDouble();
		te=aow*(ft=it)*4184;
		System.out.println("The energy needed to heat the water is "+te+" joules.");
	}
}
