import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print((int)Math.pow(-1,i)+" ");
		}
	}
}
