import java.util.*;
public class Assignment2_19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bs,d=0.0,r=0.0;
		bs=Double.parseDouble(args[0]);
		d=d+(40/100.0)*bs;
		r=r+(20/100.0)*bs;
		System.out.println("The total salary is: "+(bs+d+r));
	}

}
