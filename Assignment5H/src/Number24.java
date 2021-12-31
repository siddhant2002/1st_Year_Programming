import java.util.*;

public class Number24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,n1,j,c;
		System.out.println("Enter two numbers");
		n=sc.nextInt();
		n1=sc.nextInt();
		for(i=1;i<=Math.min(n,n1);i++)
		{
			if(n%i==0&&n1%i==0)
			{
				c=0;
				for(j=1;j<=i;j++)
					if(i%j==0)
						c++;
				if(c==2)
					System.out.print(i+" ");
			}
		}
	}
}
