
public class GenC2 {

	public static void main(String[] args) {
		Multiply<Integer , Double> nm=new Multiply<Integer , Double>(2,3,4,4.5,3.7,2.7);
		nm.showdata();
	}
}
	class Multiply<T1 , T2>
	{
		T1 var1,var2,var3;
		T2 var4,var5,var6;
		Multiply(T1 a, T1 b, T1 c, T2 d, T2 e, T2 f)
		{
			var1=a;
			var2=b;
			var3=c;
			var4=d;
			var5=e;
			var6=f;
		}
		void showdata()
		{
			int a,b,c;
			double a1,b1,c1;
			a=Integer.parseInt(var1.toString());
			b=Integer.parseInt(var2.toString());
			c=Integer.parseInt(var3.toString());
			a1=Double.parseDouble(var4.toString());
			b1=Double.parseDouble(var5.toString());
			c1=Double.parseDouble(var6.toString());
			System.out.println("The multiplication of the integers numbers are "+(a*b*c));
			System.out.println("The multiplication of the double numbers are "+(a1*b1*c1));
		}
	}
	
	
