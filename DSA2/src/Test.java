import java.util.*;
public class Test {

	public static void main(String[] args) throws InvalidAmountException {
		EmpInterface nm=new Manager();
	}
}
	interface EmpInterface
	{
		void displayEmp() throws InvalidAmountException;
		void giveBonus(double amount) throws InvalidAmountException;
	}
	abstract class Employee implements EmpInterface
	{
		int empID;
		String fName, lName;
		double salary, bonus_amount;
		Employee()
		{
			empID=0;
			fName="";
			lName="";
			salary=0;
		}
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter  first name  last name  Employee ID  salary and bonus amount");
			fName=sc.nextLine();
			lName=sc.nextLine();
			empID=sc.nextInt();
			salary=sc.nextDouble();
			bonus_amount=sc.nextDouble();
		}
		void display(int i) throws InvalidAmountException
		{
			System.out.println("The info of Employee "+(i)+" is ");
			System.out.println("The Employee ID is "+empID);
			System.out.println("The first name is "+fName);
			System.out.println("The last name is "+lName);
			System.out.println("The salary is "+salary);
			giveBonus(bonus_amount);
		}
	}
	class Manager extends Employee implements EmpInterface
	{
		Manager() throws InvalidAmountException 
		{
			displayEmp();
		}
		Manager(int i) throws InvalidAmountException
		{
			input();
			display(i);
		}
		public void displayEmp() throws InvalidAmountException 
		{
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter number of employees");
			n=sc.nextInt();
			EmpInterface nm[]=new EmpInterface[n];
			for(int i=0;i<n;i++)
			{
				nm[i]= new Manager(i+1);
			}
		}
		public void giveBonus(double amount) throws InvalidAmountException
		{
			if(amount<=0)
				throw new InvalidAmountException("Not valid bonus amount");
			else
				System.out.println("Bonus amount is "+amount);
		}
	}
		class InvalidAmountException extends Exception
		{
			InvalidAmountException(String s)
			{
				super(s);
			}
		}
