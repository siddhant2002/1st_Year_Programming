
public class SingleInheritance {

	public static void main(String[] args) {
		Operation2 nm=new Operation2();
		nm.Addition(20,27);
		nm.Subtraction(20,12);
	}
}
	class Operation1
	{
		void Addition(int a, int b)
		{
			System.out.println("Addition of two numbers is "+(a+b));
		}
	}
	class Operation2 extends Operation1
	{
		void Subtraction(int a, int b)
		{
			System.out.println("Subtraction of two numbers is "+(a-b));
		}
	}
