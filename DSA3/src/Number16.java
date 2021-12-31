import java.util.Scanner;
public class Number16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string ");
		s=sc.nextLine();
		System.out.println(s.equals(reverse(s,s.length()-1)));
	}
	static String p="";
	static String reverse(String s , int i)
	{
		if(i<0)
			return p;
		else
		{
			p=p+s.charAt(i);
			return reverse(s,i-1);
		}
	}
}