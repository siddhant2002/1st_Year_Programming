
public class TestInheritance3 {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.meow();
		c.eat();
	}
}
	class Animal6
	{
		void eat()
		{
			System.out.println("Eating.... ...");
		}
	}
	class Dog6 extends Animal6
	{
		void bark()
		{
			System.out.println("Barking....... ...");
		}
	}
	class Cat extends Animal6
	{
		void meow()
		{
			System.out.println("meoving..... ...");
		}
	}