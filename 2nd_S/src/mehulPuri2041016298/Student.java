package mehulPuri2041016298;
import java.util.Scanner;
public class Student {
	Scanner sc =new Scanner (System.in);
	String name;
	int roll;
	double marks;
	Student(){
		System.out.println("Enter Name : ");
		name =sc.nextLine();
		System.out.println("Enter Roll Number : ");
		roll=sc.nextInt();
		System.out.println("Enter Marks(out of 100) : ");
		marks =sc.nextDouble();
		
	}
	void setStudentDetails() {
		System.out.println("Enter name : ");
		name =sc.nextLine();
		System.out.println("Enter roll number : ");
		roll=sc.nextInt();
		System.out.println("Enter marks(out of 100) : ");
		marks =sc.nextDouble();
	}
	void displayStudent() {
		System.out.println("Name : "+name);
		System.out.println("Roll number: "+roll);
		System.out.println("Marks: "+marks);
	}

}


