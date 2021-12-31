import java.util.*;
public class Number59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h,m,s;
		double dis,tt;
		System.out.println("Enter the time in hours minutes and seconds");
		h=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		System.out.println("Enter the distance");
		dis=sc.nextDouble();
		dis/=1.6;
		tt=((h*60*60)+(m*60)+s)/3600.0;
		System.out.println("The average distance in miles per hour is "+(dis/tt));
	}
}
