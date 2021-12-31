import java.util.*;
public class Method5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,n1,n2;
		double s;
		System.out.println("Enter 3 numbers");
		n=sc.nextInt();
		n1=sc.nextInt();
		n2=sc.nextInt();
		s=Average(n,n1,n2);
		System.out.println("The average is "+s);
	}
	static double Average(int n, int n1, int n2)
	{
		double s=0;
		s=n+n1+n2;
		s/=3;
		return s;
	}

}
