interface M
{
		 void fun1();
	}
interface G
	{
	  void fun2();
	}
public class Huu implements M,G {
public void fun1()
{
	System.out.println("HELLO");
}
public void fun2()
{
	System.out.println("HI");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Huu nm=new Huu();
		nm.fun1();
		nm.fun2();
	}
}
	
