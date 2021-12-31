import java.util.*;
public class Assignment4_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s=0,d,dup;
		System.out.println("Enter a number");
		n=sc.nextInt();
		dup=n;
		while(dup!=0)
		{
			d=dup%10;
			System.out.print(d+" ");
			s+=d;
			dup/=10;
		}
		System.out.println();
		if(s%9==0&&n%9==0)
		{
			System.out.println("The number is divisible");
		}
		else
		{
			System.out.println("The number is not divisible");
		}
		
	}
}
