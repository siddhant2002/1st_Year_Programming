import java.util.*;
public class Number13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,c,i;
		System.out.println("Enter the number of terms of fibonacci numbers to be displayed");
		n=sc.nextInt();
		if(n==1)
		{
			System.out.println(a);
		
			System.out.print(a+" "+b+" ");
			for(i=3;i<=n;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
	}

}
