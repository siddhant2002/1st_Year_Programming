import java.util.*;
public class Assignment4_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k,r,m=1;
		for(r=1;r<=5;r++)
		{
			for(k=1;k<=r;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(r=1;r<=5;r++)
		{
			for(k=1;k<=r;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(r=1;r<=5;r++)
		{
			for(k=1;k<=r;k++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(r=1;r<=5;r++)
		{
			for(k=1;k<=r;k++)
			{
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
		}
		System.out.println();
	}
}
