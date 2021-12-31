import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,p="";
		System.out.println("Enter a string ");
		s=sc.nextLine();
		int i;
		System.out.print("The reverse of "+s+" is ");
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				p=s.charAt(i)+p;
			}
			else
			{
				System.out.print(p+" ");
				p="";
			}
		}
		System.out.println(p);
	}
}
