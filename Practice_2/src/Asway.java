
public class Asway {
		public static void main(String[] args) {
			Dog1 nm=new Dog1();
			nm.work();
		}
	}
		class Animals
		{
			void eat()
			{
				System.out.println("Eating....");
			}
		}
		class Dog1 extends Animals
		{
			void eat()
			{
				System.out.println("Eating bread");
			}
			void bark()
			{
				System.out.println("Barking...");
			}
			void work()
			{
				super.eat();
				bark();
			}
		}
