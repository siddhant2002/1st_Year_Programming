import java.util.*;
public class Assignment3_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0,c=0;
		System.out.println("Enter a number");
		a=sc.nextInt();
		if(a%5==0&&a%6==0)
		{
			b++;
		}
		if(a%5==0||a%6==0)
		{
			c++;
		}
		if(b>0)
		{
			System.out.println("Is "+a+" divisible by 5 and 6? true");
			System.out.println("Is "+a+" divisible by 5 or 6? true");
			System.out.println("Is "+a+" divisible by 5 or 6,but not both? False");
		}
		else if(b==0&&c>0)
		{
			System.out.println("Is "+a+" divisible by 5 and 6? false");
			System.out.println("Is "+a+" divisible by 5 or 6? true");
			System.out.println("Is "+a+" divisible by 5 or 6,but not both? True");
		}
		else
		{
			System.out.println("Is "+a+" divisible by 5 and 6? false");
			System.out.println("Is "+a+" divisible by 5 or 6? false");
			System.out.println("Is "+a+" divisible by 5 or 6,but not both? False");
		}
	}

}
