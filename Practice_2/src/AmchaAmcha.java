public class AmchaAmcha {

	public static void main(String[] args) {
		Shape nm=new Rectangle();
		nm.display();
		Shape nm1=new Circle();
		nm1.display();
		Shape nm2=new Square();
		nm2.display();
	}
}
	interface Shape
	{
		void display();
	}
	class Rectangle implements Shape
	{
		public void display()
		{
			System.out.println("Making Rectangle");
		}
	}
	class Circle implements Shape
	{
		public void display()
		{
			System.out.println("Making Circle");
		}
	}
	class Square implements Shape
	{
		public void display()
		{
			System.out.println("Making Square");
		}
	}
