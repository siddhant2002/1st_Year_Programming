import java.util.*;
public class Number10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,f,m,x;
		double num,sum=0;
		System.out.println("Enter Number Of Terms");
		n=sc.nextInt();
		System.out.println("Enter the value of X");
		x=sc.nextInt();
		for(i=1,m=1;i<=n;i++,m+=2)
		{
			num=Math.pow(x,m);
			f=1;
			for(j=1;j<=m;j++)
			{
				f*=j;
			}
			if(i%2==1)
			{
				sum+=num/f;
			}
			else
			{
				sum-=num/f;
			}
		}
		System.out.println("The sum is "+sum);
	}

}
