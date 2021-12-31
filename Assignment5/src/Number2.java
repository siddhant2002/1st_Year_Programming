import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,c=0,i,mark;
		System.out.println("Enter Number Of Students");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the mark");
			mark=sc.nextInt();
			if(mark>=40)
			{
				c++;
			}
		}
		System.out.println("The number of students passed is "+c);
	}

}
