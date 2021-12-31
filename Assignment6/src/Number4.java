import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=2000;i<=2020;i++)
		System.out.println("Number of days in "+i+" is "+numberOfDaysInAYear(i));
	}
	static int numberOfDaysInAYear(int year)
	{
		if(year%400==0||(year%4==0&&year%100!=0))
			return 366;
		else
			return 365;
	}
}
