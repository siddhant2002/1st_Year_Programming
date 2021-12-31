import java.util.*;
public class Assignment3_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n[]={"scissor","rock","paper"};
		int a,b;
		a=(int)(Math.random()*(2-0)+1)+0;
		System.out.println("Enter a number between 0,1,2");
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("The computer is "+n[a]+" ,You are "+n[a]+" too. It is a draw.");
		}
		else
		{
			if(a==0&&b==1)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". You won.");
			}
			else if(a==1&&b==2)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". You won.");
			}
			else if(a==2&&b==0)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". You won.");
			}
			else if(b==0&&a==1)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". Computer won.");
			}
			else if(b==2&&a==0)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". Computer won.");
			}
			else if(b==1&&a==2)
			{
				System.out.println("The computer is "+n[a]+" .You are "+n[b]+". Computer won.");
			}
		}
	}

}
