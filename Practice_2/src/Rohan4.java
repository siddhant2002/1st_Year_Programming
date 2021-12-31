
public class Rohan4 {

	public static void main(String[] args) {
		access obj1=new access();
		access obj2=new access();
		obj1.x=0;
		obj1.incre();
		obj2.incre();
		System.out.println(obj1.x+" "+obj2.x);
	}
}
	class access
	{
		int x;
		void incre()
		{
			x++;
		}
	}
