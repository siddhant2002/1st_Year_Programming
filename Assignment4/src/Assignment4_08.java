import java.util.*;
public class Assignment4_08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		String n="1";
		System.out.println(i++);
		for(i=2;i<=5;i++)
		{
			n=n+i+n;
			System.out.println(n);
		}
	}
}
