import java.util.*;
public class Number19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,d;
		String s="";
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.print("The binary representation of "+n+" is ");
		while(n!=0)
		{
			d=n%2;
			s=d+s;
			n/=2;
		}
		System.out.println(s);
	}
}
