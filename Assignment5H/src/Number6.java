import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,c;
		double c1;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(n+" ");
		for(i=1;i<n;)
		{
			c=n/i;
			c1=(double)n/i;
			if((double)c==c1)
				n/=i++;
			else
				break;
		}
		if(i>=n)
		{
			System.out.println("is a factorial number");
		}
		else
		{
			System.out.println("is not a factorial number");
		}
	}
}
