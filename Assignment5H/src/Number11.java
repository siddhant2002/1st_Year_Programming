import java.util.*;
public class Number11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=1,d,i,n;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}
}
