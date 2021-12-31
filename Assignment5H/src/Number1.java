import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,np=0,nn=0,n,n1;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("Enter "+n+" numbers");
		for(i=1;i<=n;i++)
		{
			n1=sc.nextInt();
			if(n1>=0)
				np++;
			else
				nn++;
		}
		System.out.println("The number of positive number is "+np);
		System.out.println("The number of negative number is "+nn);
	}
}
