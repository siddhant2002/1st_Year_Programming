import java.util.*;
public class Assignment2_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p,r,t;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		t=Double.parseDouble(args[2]);
		System.out.println("The interest is: "+(p*(Math.exp(r*t))));
	}

}
