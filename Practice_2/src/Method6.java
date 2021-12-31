import java.util.*;
public class Method6 {

	public static void main(String[] args) {
		Method6 nm=new Method6(7,8);
		System.out.println(nm.f+" "+nm.g);
		nm.display(3,2);
		System.out.println("Hello World");
	}
	int f,g;
	Method6(int r,int m)
	{
		f=r;
		g=m;
	}
	void display(int x,int p)
	{
		System.out.println(++x);
	}
}
