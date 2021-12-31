import java.util.*;
public class Assignment2_05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double v1,v0,t;
		System.out.println("Enter v0, v1, and t: ");
		v0=sc.nextDouble();
		v1=sc.nextDouble();
		t=sc.nextDouble();
		System.out.println("The average acceleration is "+(v1-v0)/t);
	}

}
