import java.util.*;
public class Number10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=1,b=3,c,i;
		System.out.println("Enter the number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
