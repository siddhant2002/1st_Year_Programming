import java.util.*;
public class Method4 {

	public static void main(String[] args) {
		Method4 nm=new Method4();
		Method4 kk=new Method4();
		Method4 yy;
		nm.input(4, 34);
		kk.input(5, 56);
		yy=nm.calculate(nm,kk);
		yy.display();
	}
	int hr,min,c=0;
	void input(int p, int q)
	{
		hr=p;
		min=q;
	}
	Method4 calculate(Method4 n , Method4 m)
	{
		Method4 mm=new Method4();
		mm.hr=n.hr+m.hr;
		mm.min=n.min+m.min;
		if(mm.min>60)
		{
			mm.hr=mm.hr+mm.min/60;
			mm.min=mm.min%60;
		}
		return mm;
	}
	void display()
	{
		System.out.println(hr+" : "+min+" hours");
	}
}
