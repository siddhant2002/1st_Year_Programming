import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,s,i,j;
		char p=(char)47;
		char p1=(char)92;
		String p2="|";
		System.out.println("Enter number of rows and number of symbols ");
		r=sc.nextInt();
		s=sc.nextInt();
		for(i=1;i<r;i++)
		{
			for(j=1;j<=s;j++)
			{
				System.out.print(p+""+p1);
			}
			System.out.println();
			System.out.print(p2);
			for(j=2;j<s*2;j++)
			{
				System.out.print(" ");
			}
			System.out.println(p2);
		}
		for(j=1;j<=s;j++)
		{
			System.out.print(p+""+p1);
		}
	}
}
