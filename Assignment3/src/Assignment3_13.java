import java.util.*;
public class Assignment3_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yr[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int month,year;
		System.out.println("Enter the month number");
		month=sc.nextInt();
		System.out.println("Enter the year number");
		year=sc.nextInt();
		if((year%400==0)||((year%4==0)&&year%100!=0))
		{
			if(month==2)
			{
				System.out.println(yr[month-1]+" has 29 days");
			}
			else if(month<=7)
			{
				if(month%2==1)
				{
					System.out.println(yr[month-1]+" has 31 days");
				}
				else
				{
					System.out.println(yr[month-1]+" has 30 days");
				}
			}
			else if(month>7)
			{
				if(month%2==1)
				{
					System.out.println(yr[month-1]+" has 30 days");
				}
				else
				{
					System.out.println(yr[month-1]+" has 31 days");
				}
			}
		}
		else
		{

			if(month==2)
			{
				System.out.println(yr[month-1]+" has 28 days");
			}
			else if(month<=7)
			{
				if(month%2==1)
				{
					System.out.println(yr[month-1]+" has 31 days");
				}
				else
				{
					System.out.println(yr[month-1]+" has 30 days");
				}
			}
			else if(month>7)
			{
				if(month%2==1)
				{
					System.out.println(yr[month-1]+" has 30 days");
				}
				else
				{
					System.out.println(yr[month-1]+" has 31 days");
				}
			}
		}
	}
}
