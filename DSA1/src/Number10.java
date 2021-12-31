import java.util.*;
public class Number10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		int r,m;
		Number10 nm=new Number10();
		Number10 kk=new Number10();
		Number10 pp=new Number10();
		nm.setData();
		kk.setData();
		pp.setData();
		nm.display();
		kk.display();
		pp.display();
	}
	String name;
	int roll,mark;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name roll number and mark");
		name=sc.next();
		roll=sc.nextInt();
		mark=sc.nextInt();
	}
	void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The roll number is "+roll);
		System.out.println("The mark is "+mark);
	}
}