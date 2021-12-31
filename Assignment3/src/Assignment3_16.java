import java.util.*;
public class Assignment3_16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("Enter the marks secured in the exam");
		marks=sc.nextInt();
		marks/=10;
		switch(marks)
		{
		case 9:
		case 10:
		System.out.println("The grade is 'O'");
		break;
		case 8:
			System.out.println("The grade is 'A'");
		break;
		case 7:
			System.out.println("The grade is 'B'");
			break;
		case 6:
			System.out.println("The grade is 'C'");
			break;
		case 5:
			System.out.println("The grade is 'D'");
			break;
		case 4:
			System.out.println("The grade is 'E'");
			break;
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("The grade is 'F'");
			break;
			default:
				System.out.println("Wrong choice");
		}
	}
}
