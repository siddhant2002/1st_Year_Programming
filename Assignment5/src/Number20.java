import java.util.*;
public class Number20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i=2;
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				n/=i;
			}
			else
			{
				i++;
			}
		}
	}

}
