import java.util.*;
public class Number14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a[]=new int[2];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		System.out.println("The product is "+product(a,0));
	}
	static int product(int a[] , int i)
	{
		if(i<2)
			return a[i] * product(a,++i);
		else
			return 1;
	}
}
