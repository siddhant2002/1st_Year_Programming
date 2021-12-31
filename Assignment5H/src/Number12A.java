import java.util.*;
public class Number12A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,a=0,b=1,c,n1;
		System.out.println("Enter two numbers");
		n=sc.nextInt();
		n1=sc.nextInt();
		for(c=0;c<=n;c=a+b)
		{
			if(c==n)
				break;
			a=b;
			b=c;
		}
		if(c>n)
			System.out.println(n+" is not the fibonacci number");
		else
			System.out.println(n+" is the fibonacci number");
		a=0;
		b=1;
		for(c=0;c<=n1;c=a+b)
		{
			if(c==n1)
				break;
			a=b;
			b=c;
		}
		if(c>n1)
			System.out.println(n1+" is not the fibonacci number");
		else
			System.out.println(n1+" is the fibonacci number");
	}
}
