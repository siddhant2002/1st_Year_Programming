import java.util.*;
public class Method1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		Method1 mm=new Method1();
		for(i=1;i<=10;i++)
		{
			System.out.println("Enter your name");
			mm.name=sc.next();
			System.out.println("Enter your CGPA");
			mm.cgpa=sc.nextDouble();
			System.out.println("Enter your branch");
			mm.branch=sc.next();
			System.out.println("Enter your reg Number");
			mm.regNo=sc.nextInt();
			mm.display();
		}
	}
	String name;
	int regNo;
	String branch;
	double cgpa;
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("CGPA is "+cgpa);
		System.out.println("Branch is "+branch);
		System.out.println("Reg Number is "+regNo);
	}
}
