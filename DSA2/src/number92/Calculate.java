package number92;
import java.util.*;
public class Calculate implements Sports {
	int score1,score2;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the scores");
		score1=sc.nextInt();
		score2=sc.nextInt();
	}
	public int output()
	{
		System.out.println("The first score is "+score1+" and the second score is "+score2);
		return score1+score2;
	}
}
