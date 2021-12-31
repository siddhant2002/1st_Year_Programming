import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=2;i<10000;i++)
		{
			if(isPrime(i)==true)
				System.out.println(i+" is a prime number");
			else
				System.out.println(i+" is not a prime number");
		}
	}
	static boolean isPrime(int number)
	{
		int i,c=0;
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
}
