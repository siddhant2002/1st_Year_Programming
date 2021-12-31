import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,a=0,b=1,c=1,i;
		System.out.println("Enter number of terms ");
		n=sc.nextInt();
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a+" "+b);
		else if(n==3)
			System.out.println(a+" "+b+" "+c);
		else
		{
			System.out.print(a+" "+b+" "+c+" ");
			for(i=4;i<n;i++)
			{
				s=a+b+c;
				System.out.print(s+" ");
				a=b;
				b=c;
				c=s;
			}
			System.out.println(a+b+c);
		}
	}
}
