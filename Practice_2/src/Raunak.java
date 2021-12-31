import java.util.*;
public class Raunak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s,p="",q="";
		int i;
		char c;
		System.out.println("Enter a string");
		s=sc.nextLine();
		for(i=s.length()-1;i>=0;i--)
		{
			c=s.charAt(i);
			if(c==' ')
			{
				q+=p+" ";
				p="";
			}
			else
				p=c+p;
		}
		System.out.println(q+""+p);
	}
}
