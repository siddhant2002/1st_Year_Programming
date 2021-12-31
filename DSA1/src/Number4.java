import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of lines to be entered ");
		n=sc.nextInt();
		String nm[]=new String[n];
		System.out.println("Enter "+n+" sentences");
		for(i=0;i<n;i++)
		{
			nm[i]=sc.nextLine();
		}
		for(i=n-1;i>=0;i--)
		{
			System.out.println(nm[i]);
		}
	}
}
