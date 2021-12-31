
public class Hel {

	public static void main(String[] args) {
		Bike b=new Honda();
		b.display();
		b.changegear();
	}
}
	abstract class Bike
	{
		Bike()
		{
			System.out.println("Bike");
		}
		abstract void display();
		void changegear()
		{
			System.out.println("Change gear");
	    }
	}
	class Honda extends Bike
	{
		void display()
		{
			System.out.println("Honda Bike");
		}
	}
