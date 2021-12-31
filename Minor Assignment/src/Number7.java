import java.util.*;
public class Number7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year number");
		year=sc.nextInt();
		boolean b=(year%400==0)||((year%4==0)&&year%100!=0)?true:false;
		System.out.println(b);
	}
}
