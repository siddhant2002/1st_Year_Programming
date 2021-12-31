import java.util.*;
public class Number26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,s=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s+=i;
			}
		}
		if(s==n)
			System.out.println("Perfect number");
		else
			System.out.println("Not perfect number");
	}
}
