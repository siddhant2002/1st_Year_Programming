import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,c=0,j=0;
		for(i=2;j<113;i++)
		{
			if(c==10)
			{
				c=0;
				System.out.println();
			}
			if(isPrimePalindrome(i)==1)
			{
				c++;
				j++;
				System.out.print(i+" ");
			}
		}
	}
	static int isPrimePalindrome(int n)
	{
		int i,c=0,rev=0,dup=n;
		while(dup!=0)
		{
			rev=(rev*10)+(dup%10);
			dup/=10;
		}
		for(i=1;i<=rev;i++)
		{
			if(rev%i==0)
				c++;
		}
		if(c==2&&rev==n)
			return 1;
		else
			return 0;
	}
}
