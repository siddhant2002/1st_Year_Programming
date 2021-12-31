import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,m,s=0;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1,m=1;i<=n;i++,m+=2)
		{
			if(i%2==0)
			{
				s-=m;
			}
			else
			{
				s+=m;
			}
		}
		System.out.println("The sum is "+s);
	}
}
