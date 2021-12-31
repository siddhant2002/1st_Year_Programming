import java.util.*;
public class Info {

	public static void main(String[] args) {
		Exam nm=new Exam();
		nm.setData();
	}
}
	class Student
	{
		String nm,cou;
		int rn;
		Student()
		{
		}
		
		Student(String s , int k , String r)
		{
			nm=s;
			rn=k;
			cou=r;
		}
		void display()
		{
			System.out.println("The name is "+nm);
			System.out.println("The roll number is "+rn);
			System.out.println("The course is "+cou);
			System.out.println();
		}
	}
	class Exam extends Student
	{
		Scanner sc=new Scanner(System.in);
		static int mark1,mark2,mark3,i;
		static void input_Marks()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter marks of student"+(i+1));
			mark1=sc.nextInt();
			mark2=sc.nextInt();
			mark3=sc.nextInt();
		}
		void setData()
		{
			Student stu[]=new Student[5];
			for(i=0;i<5;i++)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the name roll number and course of the student "+(i+1));
				String n=sc.next();
				int r=sc.nextInt();
				String c=sc.next();
				stu[i]=new Student(n,r,c);
			}
			for(i=0;i<5;i++)
			{
				Mark_display();
				stu[i].display();
			}
		}
		static void Mark_display()
		{
			input_Marks();
			System.out.println("The marks secured in 3 subjects are of student "+(i+1)+" is "+mark1+" "+mark2+" "+mark3);
		}
	}

