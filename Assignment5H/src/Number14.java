import java.util.*;
public class Number14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,c=0;
		System.out.println("Enter a number ");
		n=sc.nextInt();
		System.out.print("The number of digits in "+n+" is ");
		while(n!=0)
		{
			c++;
			n/=10;
		}
		System.out.println(c);
	}
}
