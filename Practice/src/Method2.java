import java.util.*;
public class Method2 {

	public static void main(String[] args) {
		int a;
		a=aniket(5);
		System.out.println("The remainder is "+a);
	}
	static int aniket(int y)
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		return a%b;
	}
}
