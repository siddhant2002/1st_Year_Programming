import java.util.*;
public class Method5 {

	public static void main(String[] args) {
			Method5 nm=new Method5();
			Method5 kk=new Method5();
			Method5 yy;
			nm.input(24,12);
			kk.input(12,34);
			yy=nm.calculate(nm,kk);
			yy.display();
	}
		int r,i,c=0;
		void input(int p, int q)
		{
			r=p;
			i=q;
		}
		Method5 calculate(Method5 n1 , Method5 m1)
		{
			Method5 mm=new Method5();
			mm.r=n1.r+m1.r;
			mm.i=n1.i+m1.i;
			return mm;
		}
		void display()
		{
			System.out.println("The sum of the complex numbers is "+r+" i"+i);
		}
}
