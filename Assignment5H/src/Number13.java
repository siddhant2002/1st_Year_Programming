import java.util.*;
public class Number13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		System.out.println(fibo(i));
	}
	static int fibo(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		else
			return facto(n-1)+facto(n-2);
	}
	static int facto(int n)
	{
		int i,f=1;
		for(i=1;i<=n;i++)
			f*=i;
		return f;
	}
}
