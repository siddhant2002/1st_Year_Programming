import java.util.*;
public class Method2 {

	public static void main(String[] args) {
		Method2 s1=new Method2();
		Method2 s2=new Method2();
		s1.name="Rahul";
		s1.regNo=123456;
		s1.branch="CSE";
		s2.cgpa="9.8";
		s2.name="Sachin";
		s2.regNo=652354;
		s2.branch="CSE";
		s2.cgpa="9.8";
		s1.display();
		s2.display();
	}
	String name;
	int regNo;
	String branch;
	String cgpa;
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Reg Number is "+regNo);
		System.out.println("Branch is "+branch);
		System.out.println("CGPA is "+cgpa);
	}
}
