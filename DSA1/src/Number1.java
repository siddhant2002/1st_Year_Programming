import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b==c&&a==b-c&&a*b==c)
			System.out.println("Correct");
		else
			System.out.println("Wrong");
	}
}
