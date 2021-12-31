import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,f=1,x;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println((Math.pow(x,n))/f);
	}

}
