import java.util.*;
public class Assignment3_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day,day1,ch;
		System.out.println("Enter today's day");
		day=sc.nextInt();
		System.out.println("Enter the number of days elapsed since today");
		day1=sc.nextInt();
		day1=day1%7;
		ch=day+day1;
		if(ch>7)
		{
			ch=ch%7;
		}
		switch(ch)
		{
		case 0:
		case 7:
			System.out.println("Sunday");
			break;
		case 1:
		case 8:
			System.out.println("Monday");
			break;
		case 2:
		case 9:	
			System.out.println("Tuesday");
			break;
		case 3:
		case 10:	
			System.out.println("Wednesday");
			break;
		case 4:
		case 11:	
			System.out.println("Thrusday");
			break;
		case 5:
		case 12:	
			System.out.println("Friday");
			break;
		case 6:
		case 13:	
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Wrong choice");
		}
	}
}
