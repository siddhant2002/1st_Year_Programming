import java.util.*;
public class Assignment2_12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ne,g;
		System.out.println("Enter the number of eggs you have");
		ne=sc.nextInt();
		g=ne/144;
		System.out.print("Your number of eggs is "+g+" gross, ");
		g=g*144;
		ne=ne-g;
		g=ne/12;
		System.out.print(g+" dozen, and ");
		g=ne%12;
		System.out.println(g);
	}

}
