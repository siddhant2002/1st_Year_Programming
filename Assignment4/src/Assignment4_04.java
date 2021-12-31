import java.util.*;
public class Assignment4_04 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int a,b,c,i;
		System.out.println("Enter count from, count to, increment operator");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(i=a;i<=b;i+=c)
		{
			System.out.print(i+" ");
		}
	}
}
