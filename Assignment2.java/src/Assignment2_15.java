import java.util.*;
import java.lang.*;
public class Assignment2_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the 1st number");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		b=sc.nextInt();
		c=(int)(Math.random()*(b-a)+1)+a;
		System.out.println(c);
	}
}
