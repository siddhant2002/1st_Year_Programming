import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=3,j=i+2;i<=1000;i+=2,j+=2)
		{
			if(twinPrime(i)==1&&twinPrime(j)==1)
			{
				if(Math.abs(i-j)==2)
				System.out.println("("+i+", "+j+")");
			}
		}
	}
	static int twinPrime(int i)
	{
		int k,c=0;
		for(k=1;k<=i;k++)
		{
			if(i%k==0)
				c++;
		}
		if(c==2)
			return 1;
		else 
			return 0;
	}
}
