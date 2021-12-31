import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n,c,s,ch;
		int a,a1,a2;
		System.out.println("Enter student name");
		n=sc.nextLine();
		System.out.println("Enter student age");
		a=sc.nextInt();
		Student nm=new Student();
		System.out.println("Enter the course roll number and mark");
		c=sc.next();
		a1=sc.nextInt();
		a2=sc.nextInt();
		nm.course(c);
		nm.roll(a1);
		nm.mark(a2);
		nm.display(n,a);
		nm.display();
		sc.nextLine();
		System.out.println("Enter teacher name");
		n=sc.nextLine();
		System.out.println("Enter teacher age");
		a=sc.nextInt();
		sc.nextLine();
		Teacher kk=new Teacher();
		System.out.println("Enter the subject assigned and contact hours");
		s=sc.nextLine();
		ch=sc.nextLine();
		kk.subject(s);
		kk.conHo(ch);
		kk.display(n,a);
		kk.display();
	}
}
	class Person
	{
		void display(String n, int a)
		{
			System.out.println("The name is "+n+" and the age is "+a);
		}
	}
	class Student extends Person
	{
		String course;
		int roll,mark;
		void course(String c)
		{
			course=c;
		}
		void roll(int r)
		{
			roll=r;
		}
		void mark(int m)
		{
			mark=m;
		}
		void display()
		{
			System.out.println("The course is "+course);
			System.out.println("The roll number is "+roll);
			System.out.println("The mark is "+mark);
		}
	}
	class Teacher extends Person
	{
		String n;
		int a;
		String subject_assigned,contact_hours;
		void subject(String s)
		{
			subject_assigned=s;
		}
		void conHo(String c)
		{
			contact_hours=c;
		}
		void display()
		{
			System.out.println("The subject assigned is "+subject_assigned);
			System.out.println("The contact hours are "+contact_hours);
		}
	}
