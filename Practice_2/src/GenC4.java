import java.util.*;
public class GenC4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b,c;
		int d,e,f;
		System.out.println("Enter employee's ID, salary, name, house number, city, state");
		d=sc.nextInt();
		e=sc.nextInt();
		a=sc.next();
		f=sc.nextInt();
		b=sc.next();
		c=sc.next();
		Employee nm=new Employee();
		Employee.Address kk=nm.new Address();
		nm.getdata(d,e,a);
		nm.showdata();
		kk.getdata(f,b,c);
		kk.showdata();
		
	}
}
	class Employee
	{
		int eid,salary;
		String name;
		void getdata(int a, int b, String c)
		{
			eid=a;
			salary=b;
			name=c;
		}
		void showdata()
		{
			System.out.println("The employee ID is "+eid);
			System.out.println("The salary is "+salary);
			System.out.println("The name is "+name);
		}
		class Address
		{
			int hn;
			String city,state;
			void getdata(int a, String b, String c)
			{
				hn=a;
				city=b;
				state=c;
			}
			void showdata()
			{
				System.out.println("The house number is "+hn);
				System.out.println("The city is "+city);
				System.out.println("The state is "+state);
			}
		}
	}
