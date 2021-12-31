import java.util.*;
public class Assignment2_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		s=s+n%10;
		n/=10;
		s=s+n%10;
		n/=10;
		s=s+n%10;
		System.out.println("The sum is "+s);
	}

}
