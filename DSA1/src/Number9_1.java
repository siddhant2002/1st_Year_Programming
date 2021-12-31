import java.util.Scanner;

public class Number9_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		int r;
		double m;
		Number9_1 nm=new Number9_1();
		Number9_1 kk=new Number9_1();
		Number9_1 pp=new Number9_1();
		System.out.println("Enter name roll number and mark");
		nm.setData();
		System.out.println("Enter name roll number and mark");
		kk.setData();
		System.out.println("Enter name roll number and mark");
		pp.setData();
		nm.display();
		kk.display();
		pp.display();
	}
	private String name;
	private int roll;
	private double mark;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		this.name=sc.next();
		this.roll=sc.nextInt();
		this.mark=sc.nextDouble();
	}
	void display()
	{
		System.out.println("The name is "+this.name);
		System.out.println("The roll number is "+this.roll);
		System.out.println("The mark is "+this.mark);
	}
}
