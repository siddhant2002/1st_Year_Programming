import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,c=0;
		System.out.println("Enter the number to be searched");
		n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter 10 numbers ");
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			if(n==a[i])
				c++;
		}
		if(c==0)
			System.out.println("No such number is found");
		else
		{
			if(c==1)
				System.out.println("It is present only 1 time");
			else
				System.out.println("It is present "+c+" times");
		}
	}

}
