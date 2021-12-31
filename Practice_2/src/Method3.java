import java.util.*;
public class Method3 {

	public static void main(String[] args) {
		Method3 nm=new Method3();
		Method3 kk=new Method3();
		nm.input(4, 34);
		kk.input(5, 56);
		nm.calculate(nm,kk);
	}
	int hr,min,c=0;
	void input(int p, int q)
	{
		hr=p;
		min=q;
	}
	void calculate(Method3 n , Method3 m)
	{
		Method3 mm=new Method3();
		mm.hr=n.hr+m.hr;
		mm.min=n.min+m.min;
		if(mm.min>60)
		{
			c=mm.min/60;
			mm.min=mm.min%60;
		}
		System.out.println("The time is "+(mm.hr+c)+" hours "+mm.min+" minutes");
	}
}
