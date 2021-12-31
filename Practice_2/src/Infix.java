
public class Infix{

	public static void main(String[] args) {
		Abc nm=new Abc();
		nm.add1();
	}
}
      class Abc
	{
		void add1()
		{
			System.out.println(3+5);
		}
	}
     class Abcc extends Abc
	{
		void add2()
		{
			System.out.println(2+3);
		}
	}
    class Abccc extends Abc
	{
		void add3()
		{
			System.out.println(6+2);
		}
	}
