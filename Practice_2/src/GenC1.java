
public class GenC1{

	public static void main(String[] args) {
		Test<Integer , String> nm=new Test<Integer , String>(1996,"ITER");
		nm.showdata();
	}
}
	class Test<T1 , T2>
	{
		T1 var1;
		T2 var2;
		Test(T1 v1 , T2 v2)
		{
			System.out.println(var1);
			System.out.println(var2);
			var1=v1;
			var2=v2;
			System.out.println(var1);
			System.out.println(var2);
		}
		void showdata()
		{
//			System.out.println(var1);
//			System.out.println(var2);
		}
	}
