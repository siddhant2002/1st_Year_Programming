import java.util.*;
public class Assignment3_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		int a;
		System.out.println("Enter a character");
		c=sc.next().charAt(0);
		a=(int)c;
		if(a>=65&&a<=90)
		{
			System.out.println("Capital letter.");
		}
		else if(a>=97&&a<=122)
		{
			System.out.println("Small Case letter.");
		}
		else if(a>=48&&a<=57)
		{
			System.out.println("Digits.");
		}
		else if((a>=0&&a<=47)||(a>=58&&a<=64)||(a>=91&&a<=96)||(a>=123&&a<=127)||a==32)
		{
			System.out.println("Special character");
		}
	}
}
