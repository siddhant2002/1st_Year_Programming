import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string ");
		s=sc.nextLine();
		reverse(s);
	}
	static void reverse(String s)
	{
		if(s.length()==0)
			System.out.println(s);
		else
		{
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0,s.length()-1));
		}
	}
}
