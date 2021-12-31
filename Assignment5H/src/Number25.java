import java.util.*;

public class Number25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,n1,s=0,s1=0;
		System.out.println("Enter two numbers");
		n=sc.nextInt();
		n1=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		for(i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				s1+=i;
			}
		}
		if(s==n1&&s1==n)
			System.out.println("Amicable Pair");
		else
			System.out.println("Not Amicable Pair");
	}
}
