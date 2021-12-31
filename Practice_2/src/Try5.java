
public class Try5 {

	public static void main(String[] args) {
		valiadate(13);
		System.out.println("Rest of the code");
	}

	private static void valiadate(int age) {
		if(age<18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
			System.out.println("Welcome to vote");
	}
}
