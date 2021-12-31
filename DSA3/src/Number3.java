import java.io.IOException;
import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks;
		System.out.println("Enter marks");
		marks=sc.nextInt();
		try
		{
			if(marks>100)
				throw new MarksOutOfBoundException("Faltu mark");
			else
				System.out.println("Mark is "+marks);
		}
		catch(MarksOutOfBoundException e)
		{
			System.out.println(e);
		}
	}
}
class MarksOutOfBoundException extends Exception
{
	MarksOutOfBoundException(String s)
	{
		super(s);
	}
}
