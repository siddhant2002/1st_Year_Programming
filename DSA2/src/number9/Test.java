package number9;
import java.util.*;
class Student {
	String name;
	int roll;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and roll number of the student");
		name=sc.nextLine();
		roll=sc.nextInt();
	}
	public int output()
	{
		System.out.println("The name of the student is "+name+" and roll number is "+roll);
		return roll;
	}
}
public class Test extends Student
	{
		int mark1,mark2;
		public void input()
		{
			super.input();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter marks of the student");
			mark1=sc.nextInt();
			mark2=sc.nextInt();
		}
		public int output()
		{
			super.output();
			System.out.println("The first mark of the student is "+mark1+" and second mark is "+mark2);
			return mark1+mark2;
		}
	}