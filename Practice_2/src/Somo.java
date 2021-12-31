import java.util.*;
public class Somo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student\'s Name: ");
		String name=input.nextLine();
		System.out.println("Enter Student\'s Age: ");
		int age=input.nextInt();
		input.nextLine();
		StudentBenga s = new StudentBenga(name, age);
		System.out.println("Enter Student\'s Course: ");
		s.setCourse(input.nextLine());
		System.out.println("Enter Student\'s Roll Number: ");
		s.setRollNumber(input.nextInt());
		System.out.println("Enter Student\'s Marks: ");
		s.setMarks(input.nextInt());
		s.display();
		System.out.println("Enter Teacher\'s Name: ");
		String name1=input.next();
		System.out.println("Enter Teacher\'s Age: ");
		int age1=input.nextInt();
		input.nextLine();
		Teacher nm=new Teacher(name1,age1);
		System.out.println("Enter subject\'s assigned");
		nm.setSubjectAssigned(input.nextLine());
		System.out.println("Enter contact\'s hours");
		nm.setContactHour(input.nextInt());
		nm.display();
	}
}
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
class StudentBenga extends Person{	 
	String course;
	int roll_number, marks;
	StudentBenga(String name, int age){
		super(name, age);
	}
	public void setCourse(String s) {
		course=s;
	}
	public void setRollNumber(int i) {
		roll_number=i;
	}
	public void setMarks(int i) {
		marks=i;
	}
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Course = "+course);
		System.out.println("Roll Number = "+roll_number);
		System.out.println("Marks = "+marks);
	}
}
class Teacher extends Person{
	String subject_assigned;
	int contact_hour;
	Teacher(String name, int age){
		super(name, age);
	}
	void setSubjectAssigned(String s) {
		subject_assigned = s;
	}
	void setContactHour(int i) {
		contact_hour=i;
	}
	public void display() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Subject Assigned: "+subject_assigned);
		System.out.println("Contact Hour: "+contact_hour);
	}
}
