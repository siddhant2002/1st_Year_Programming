package Recursion_Programs;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string ");
		s=sc.nextLine();
		System.out.println(reverse(s,0));
	}
	static String p="";
	static String reverse(String s , int i)
	{
		if(i>s.length()-1)
			return p;
		else
		{
			p=s.charAt(i)+p;
			return reverse(s,i+1);
		}
	}
}