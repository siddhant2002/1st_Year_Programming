import java.util.*;
public class Assignment3_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fn,ln;
		char c,c1;
		int age;
		System.out.println("What is your gender (M or F): ");
		c=sc.next().charAt(0);
		System.out.println("Enter your first name");
		fn=sc.next();
		System.out.println("Enter your last name");
		ln=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		if(c=='F')
		{
			if(age>=20)
			{
				System.out.println("Are you married "+fn+" (y or n)");
				c1=sc.next().charAt(0);
				if(c1=='y')
				{
					System.out.println("Enter the name with whom you have married");
					String k=sc.next();
				}
				else
				{
					System.out.println("Then I shall call you Ms. "+fn+" "+ln);
				}
			}
			else
			{
				System.out.println("Then I shall call you "+fn+" "+ln);
			}
		}
		else
		{
			if(age>=20)
			{
				System.out.println("Then I shall call you Mr.FF"+fn+" "+ln);
			}
			else
			{
				System.out.println("Then I shall call you "+fn+" "+ln);
			}
		}
	}
}
