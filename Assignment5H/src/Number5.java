import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,f=1;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println(1.0/f);
	}

}
