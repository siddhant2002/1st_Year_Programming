import java.util.*;
public class Assignment3_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("Enter your marks");
		marks=sc.nextInt();
		if(marks>=40)
		{
			System.out.println("\"Congratulations! Ypu have passed the exam.\"");
		}
		else
		{
			System.out.println("\"Sorry! You have failed the exam.\"");
		}
	}
}
