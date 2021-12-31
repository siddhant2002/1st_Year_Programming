import java.util.*;
public class Rohan3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,i;
		String p,q="";
		System.out.println("Enter a number");
		a=sc.nextInt();
		p=Integer.toBinaryString(a);
		for(i=0;i<p.length();i++)
		{
			q=p.charAt(i)+q;
		}
		System.out.println(q);
	}
}
