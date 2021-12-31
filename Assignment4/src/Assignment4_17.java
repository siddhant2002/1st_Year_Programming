import java.util.*;
public class Assignment4_17 {

	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i%j==0||j%i==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(i);
		}
	}

}
