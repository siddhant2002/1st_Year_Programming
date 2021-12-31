import java.util.*;
public class String4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="the quick brown fox";
		String s2="queen";
		int i;
		char arr[]=new char[s1.length()];
		char mask[]=new char[256];
		for(i=0;i<s2.length();i++)
		{
			mask[s2.charAt(i)]++;
		}
		for(i=0;i<s2.length();i++)
			System.out.print(mask[i]+" ");
		for(i=0;i<s1.length();i++)
			if(mask[s1.charAt(i)]==0)
			   System.out.print(s1.charAt(i)+" ");
	}
}
