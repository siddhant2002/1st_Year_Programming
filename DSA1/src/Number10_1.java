import java.util.Scanner;

public class Number10_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		int r;
		double m;
		System.out.println("Enter name roll number and mark");
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextDouble();
		Number10_1 nm=new Number10_1();
		Number10_1 kk=new Number10_1();
		Number10_1 pp=new Number10_1();
		nm.setData(n,r,m);
		System.out.println("Enter name roll number and mark");
		sc.nextLine();
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextDouble();
		kk.setData(n,r,m);
		System.out.println("Enter name roll number and mark");
		n=sc.next();
		r=sc.nextInt();
		m=sc.nextDouble();
		pp.setData(n,r,m);
		nm.display();
		kk.display();
		pp.display();
	}
	private String name;
	private int roll;
	private double mark;
	void setData(String name, int roll, double mark)
	{
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	void display()
	{
		System.out.println("The name is "+this.name);
		System.out.println("The roll number is "+this.roll);
		System.out.println("The mark is "+this.mark);
	}
}
