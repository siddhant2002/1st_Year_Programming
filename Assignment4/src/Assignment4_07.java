import java.util.*;
public class Assignment4_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double s=0,m;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			m=Math.random();
			System.out.println(m);
			s+=m;
		}
		System.out.println("The average is "+(s/--i));
	}
}
