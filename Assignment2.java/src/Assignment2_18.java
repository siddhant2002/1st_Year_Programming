import java.util.*;
public class Assignment2_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		if((a>b&&b>c)||(c>b&&b>a))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
