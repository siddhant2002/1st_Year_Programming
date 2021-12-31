
public class TestInheritance {

	public static void main(String[] args) {
		BabyDog nm=new BabyDog();
		nm.weep();
		nm.bark();
		nm.eat();
	}
}
   class Animal
	{
		void eat()
		{
			System.out.println("Eating.... ...");
		}
	}
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("Barking....... ...");
		}
	}
	class BabyDog extends Dog 
	{
		void weep()
		{
			System.out.println("Weeping..... ...");
		}
	}
