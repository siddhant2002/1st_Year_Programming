import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		Person2 nm=new Task();
		nm.display();
	}
}
interface Person2
{
	void display();
}
class Task implements Person2
{
	static int maxcount;
	String name;
	Task()
	{
		maxcount=0;
	}
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the person");
		name=sc.nextLine();
		int i,l;
		char c;
		l=name.length();
		name=name.toLowerCase();
		for(i=0;i<l;i++)
		{
			c=name.charAt(i);
			if((c>='a'&&c<='z')||(c>='0'&&c<='9'))
				maxcount++;
		}
		System.out.println("The name of the person is "+name+" and number of characters is "+maxcount);
	}
}
