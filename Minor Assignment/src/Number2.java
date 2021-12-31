import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The Orginal values are: "+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The Swaped values: "+ a+" "+b);
	}
}
