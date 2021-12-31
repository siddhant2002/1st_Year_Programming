import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		for(int i =0; i<emp.length;i++)
		{
		Scanner sc=new Scanner (System.in) ;
		System.out.println("Enter the information of emp[ " + i + " ] object") ;
		String s=sc.next();
		int x=sc.nextInt();
		emp[i]=new Employee(s,x) ;
		}
		for (int i=0;i<emp.length;i++)
		{
		emp[i].display( ) ;
		}
	}
}
	class Employee
	{ 
		String name ;
		int id;
	Employee (String s1 , int p)
	{
		name=s1;
		id=p;
	}
	void display( )
	{
		System.out.println("The name of the Employee is : "+name) ;
		System.out.println("The ID of the Employee is : " + id) ;
	}
	}


