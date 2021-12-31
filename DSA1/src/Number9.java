import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		int r,m;
		System.out.println("Enter name roll number and mark");
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextInt();
		Number9 nm=new Number9();
		Number9 kk=new Number9();
		Number9 pp=new Number9();
		nm.setData(n,r,m);
		System.out.println("Enter name roll number and mark");
		sc.nextLine();
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextInt();
		kk.setData(n,r,m);
		System.out.println("Enter name roll number and mark");
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextInt();
		pp.setData(n,r,m);
		nm.display();
		kk.display();
		pp.display();
	}
	String name;
	int roll,mark;
	void setData(String p, int r, int m)
	{
		name=p;
		roll=r;
		mark=m;
	}
	void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The roll number is "+roll);
		System.out.println("The mark is "+mark);
	}
}
