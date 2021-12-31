import java.util.*;
public class Number15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double amt,rate,tamt=0,i,inte;
		int time;
		System.out.println("Enter the amount");
		amt=sc.nextDouble();
		System.out.println("Enter the rate of interest");
		rate=sc.nextDouble();
		System.out.println("Enter the duration");
		time=sc.nextInt();
		for(i=1;i<=time;i++)
		{
			inte=rate/(12.0*100.0);
			amt=amt*(1+inte);
			tamt+=amt;
		}
		System.out.println("The total amount is "+tamt);
	}
}
