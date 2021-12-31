import java.util.*;
public class GenC5 {

	public static void main(String[] args) {
		GenC5 nm=new GenC5();
		nm.max(3532,4524,2343);
	}
		<T1> void max(T1 a, T1 b, T1 c)
		{
			int a1,b1,c1;
			a1=Integer.parseInt(a.toString());
			b1=Integer.parseInt(b.toString());
			c1=Integer.parseInt(c.toString());
			System.out.println("The maximum element is "+(Math.max(a1,Math.max(b1,c1))));
		}
}
