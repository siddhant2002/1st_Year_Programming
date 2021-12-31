import java.util.*;
import java.util.Scanner;
public class Number22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,x;
		System.out.println("Enter the value of x and n");
		x=sc.nextInt();
		n=sc.nextInt();
		System.out.println("the value will be "+(int)Math.pow(x,n));
	}
}
