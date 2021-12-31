import java.util.*;
public class Number6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int i,c=0;
		System.out.println("Enter a string ");
		s=sc.nextLine();
		char c1;
		System.out.println("Enter a character which is to be searched ");
		c1=sc.next().charAt(0);
		for(i=0;i<s.length();i++)
		{
			if(c1==s.charAt(i))
				c++;
		}
		System.out.println("Number of occurence of "+c1+" in "+s+" is "+c);
	}
}
