import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sales;
		System.out.println("Enter the sales value");
		sales=sc.nextDouble();
		if(sales>=0)
		{
			Commission nm=new Commission(sales);
			nm.getCommission();
		}
		else
			System.out.println("Invalid Input");
	}
}
	class Commission
	{
		double sales;
		Commission(double s)
		{
			sales=s;
		}
		void getCommission()
		{
			if(sales<500)
				System.out.println("The commission is "+((2*sales)/100.0));
			else if(sales>=500&&sales<5000)
				System.out.println("The commission is "+((5*sales)/100.0));
			else
				System.out.println("The commission is "+((8*sales)/100.0));
		}
	}
