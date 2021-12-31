import java.util.*;
public class Chiki {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter number of rows");
		n=sc.nextInt();
		if(n%2==1)
		{
			for(i=1;i<=(n+1)/2;i++)
			{
				for(j=1;j<=i;j++)
					System.out.print("* ");
				System.out.println();
			}
			for(;i<=n;i++)
			{
				for(j=1;j<=(n+1)-i;j++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}
}
