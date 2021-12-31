import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,np=0,nn=0,n,s=0;
		do
		{
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n>0)
			{
				np++;
			}
			else if(n<0)
			{
				nn++;
			}
			s+=n;
			System.out.println("Enter 0 to terminate the program");
		}while(n!=0);
		System.out.println("The number of positives is "+np);
		System.out.println("The number of negatives is "+nn);
		System.out.println("The total sum is "+(double)(s));
		System.out.println("The average is "+(double)s/(np+nn));
	}

}
