import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double b,apir,inter;
		System.out.println("Enter the balance");
		b=sc.nextDouble();
		System.out.println("Enter annual percentage interest rate");
		apir=sc.nextDouble();
		inter=b*(apir/1200.0);
		System.out.println("The interest for the next month is "+inter);
	}
}
