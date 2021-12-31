import java.util.*;
public class Number10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter a number");
		n=sc.nextInt();
		task(0,0,String.valueOf(n),n);
	}
	static void task(int n, int i, String k, int r)
	{
		if(i==3)
			System.out.println(n);
		else
		{
			n=n+Integer.parseInt(k);
			k=k+r;
			i++;
			task(n,i,k,r);
		}
	}
}
