import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			int n,i;
			System.out.println("Enter number of colours to be added");
			n=sc.nextInt();
			String a[]=new String[n];
			System.out.println("Enter "+n+" colours");
			for(i=0;i<n;i++)
			{
				a[i]=sc.next();
			}
			try
			{
				System.out.println(a[n+1]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
	}
}
