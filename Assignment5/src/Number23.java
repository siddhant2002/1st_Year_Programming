import java.util.Scanner;
import java.util.*;
public class Number23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,c=0,j,c1=0;;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
				c1++;
			}
		}
		System.out.println();
		System.out.println("The number of primes is "+c1);
	}

}
