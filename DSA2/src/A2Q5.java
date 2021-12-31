import java.util.*;
public class A2Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student's Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Student's Age : ");
		int age = sc.nextInt();
		sc.nextLine();

		Student2 student = new Student2(name, age);
		System.out.print("Enter Student's Course : ");
		student.setCourse(sc.nextLine());
		System.out.print("Enter Student's Roll Number : ");
		student.setRollNumber(sc.nextInt());
		System.out.print("Enter Student's Marks : ");
		student.setMarks(sc.nextInt());

		System.out.print("Enter Teacher Name : ");
		String t_name = sc.next();
		System.out.print("Enter Teacher Age : ");
		int t_age = sc.nextInt();
		sc.nextLine();

		Teacher1 teacher = new Teacher1(t_name, t_age);
		System.out.print("Enter Subject Assigned Course : ");
		teacher.setSubjectAssigned(sc.next());
		System.out.print("Enter Contact Hour: ");
		teacher.setContactHour(sc.nextInt());

		student.display();
		teacher.display();
		
		sc.close();

	}
}

class Person1 {
	String name;
	int age;

	Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student2 extends Person1 {
	String course;
	int roll_num, marks;

	Student2(String name, int age) {
		super(name, age);
	}

	public void setCourse(String s) {
		course = s;
	}

	public void setRollNumber(int i) {
		roll_num = i;
	}

	public void setMarks(int i) {
		marks = i;
	}

	public void display() {
		System.out.println("\n\nStudent's Data:");
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Course = " + course);
		System.out.println("Roll Number = " + roll_num);
		System.out.println("Marks = " + marks);
	}
}

class Teacher1 extends Person1 {
	String sub_assigned;
	int contact_hr;

	Teacher1(String name, int age) {
		super(name, age);
	}

	public void setSubjectAssigned(String student) {
		sub_assigned = student;
	}

	public void setContactHour(int i) {
		contact_hr = i;
	}

	public void display() {
		System.out.println("\nTeacher's Data");
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Subject Assignned : " + sub_assigned);
		System.out.println("Contract Hours : " + contact_hr);
	}
}
