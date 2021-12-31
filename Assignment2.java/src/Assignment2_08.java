import java.util.*; 
import java.lang.*;
public class Assignment2_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a,b;
		System.out.println("Enter the base and the power: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println((int)Math.pow(a++,b++));
		System.out.println((int)Math.pow(a++,b++));
		System.out.println((int)Math.pow(a++,b++));
		System.out.println((int)Math.pow(a++,b++));
		System.out.println((int)Math.pow(a++,b++));
	}

}
