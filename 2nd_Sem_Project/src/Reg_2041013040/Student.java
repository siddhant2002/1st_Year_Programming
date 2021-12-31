package Reg_2041013040;
import java.util.Scanner;
public class Student
{
	String name;
	int roll;
	double mark;
	void setStudentsDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name , roll number and mark");
		name=sc.next();
		roll=sc.nextInt();
		mark=sc.nextDouble();
		System.out.println();
	}
	void displayStudent()
	{
		System.out.println("The name of the student is "+name);
		System.out.println("The roll number of the student is "+roll);
		System.out.println("The mark of the student is "+mark);
		System.out.println();
	}
}
