
public class Amcha {

	public static void main(String[] args) {
		A nm=new B();
		nm.display();
	}
}
	abstract class A
	{
		abstract void display();
	}
	class B extends A
	{
		void display()
		{
			System.out.println("haaa");
		}
	}
