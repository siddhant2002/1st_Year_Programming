import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,f,j,s=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			f=1;
			for(j=1;j<=i;j++)
			{
				f*=j;
			}
			s+=f;
		}
		System.out.println("The sum of the factorial terms is "+s);
	}
}
