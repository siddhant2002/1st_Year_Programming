import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,s=0,n1;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter a number");
			n1=sc.nextInt();
			s+=n1;
		}
		System.out.println("The average is "+(double)s/i);
	}

}
