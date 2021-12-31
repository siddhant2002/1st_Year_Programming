import java.util.*;
public class Number15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0;
		System.out.println("Enter a number ");
		n=sc.nextInt();
		System.out.print("The sum of digits in "+n+" is ");
		while(n!=0)
		{
			s+=n%10;
			n/=10;
		}
		System.out.println(s);
	}
}
