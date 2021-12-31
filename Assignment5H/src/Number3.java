import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print((int)Math.pow(2,i)+" ");
		}
	}

}
