import java.util.*;
public class Number14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pass;
		System.out.println("Enter your password");
		pass=sc.nextLine();
		System.out.println(passwordCheck(pass));
	}
	static String passwordCheck(String password)
	{
		int i,l,c1=0;
		char c;
		l=password.length();
		for(i=0;i<l;i++)
		{
			c=password.charAt(i);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9'))
			{
				if(c>='0'&&c<='9')
					c1++;
			}
			else
				break;
		}
		if(l>=8&&c1>=2&&i==l)
			return "Valid Password";
		else
			return "Not Valid Password";
	}
}
