import java.util.*;
public class Assignment4_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(s<=n)
		{
			s*=2;
		}
		System.out.println("The largest power of 2 is "+(s/2));
	}
}
