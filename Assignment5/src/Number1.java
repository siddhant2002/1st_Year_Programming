import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(i+"  "+(int)(Math.pow(2,i)));
		}
	}

}
