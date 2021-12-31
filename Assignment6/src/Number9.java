import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		System.out.println("Enter the value of a, b, c, d");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=smallCommonDenominator(c,d);
		System.out.println("The sum is "+((double)a/e+(double)b/e));
	}
	static int smallCommonDenominator(int a,int b)
	{
		int i,scd=0;
		for(i=1;i<=Math.min(a,b);i++)
		{
			if(a%i==0&&b%i==0)
			{
				scd=i;
			}
		}
		return scd;
	}
}
