import java.util.*;
public class Number12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String f;
		int k;
		float r;
		System.out.println("Enter the name of the flower");
		f=sc.nextLine();
		System.out.println("Enter the number of petals");
		k=sc.nextInt();
		System.out.println("Enter the price of the flower");
		r=sc.nextFloat();
		Number12 nm=new Number12(f,k,r);
		nm.display();
	}
	String fn;
	int np;
	float p;
	Number12(String f, int k, float r)
	{
		fn=f;
		np=k;
		p=r;
	}
	void display()
	{
		System.out.println("The name of the flower is "+fn);
		System.out.println("The number of petals is "+np);
		System.out.println("The price is "+p);
	}
}
