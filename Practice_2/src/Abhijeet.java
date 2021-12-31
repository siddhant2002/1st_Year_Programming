import java.util.*;
public class Abhijeet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,n1=3,n2=3,i1,s=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(" ");
		}
		System.out.println("1");
		for(i=1;i<n;i++)
		{
			for(i1=1;i1<n-i;i1++)
			{
				System.out.print(" ");
			}
			for(i1=1;i1<=i;i1++)
			{
				System.out.print(n1 +" ");
				n1+=2;
			}
			s=0;
			for(i1=1;i1<=(i*2);i1++)
			{
				s=s+n2;
				n2+=2;
			}
			System.out.print(s+" ");
			for(i1=1;i1<=i;i1++)
			{
				System.out.print(n1 +" ");
				n1+=2;
			}
			System.out.println();
		}
	}
}
