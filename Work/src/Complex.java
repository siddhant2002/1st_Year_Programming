import java.util.*;
public class Complex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex nm=new Complex();
		Complex kk=new Complex();
		nm.setData();
		kk.setData();
		nm=nm.add(nm, kk);
		nm.display();
	}
	int real,image;
	Complex()
	{
		real=0;
		image=0;
	}
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part and imaginary part of the number");
		real=sc.nextInt();
		image=sc.nextInt();
	}
	Complex add(Complex nm, Complex kk)
	{
		Complex k=new Complex();
		k.real=nm.real+kk.real;
		k.image=nm.image+kk.image;
		return k;
	}
	void display()
	{
		System.out.println("The real part of the number is "+real +" and imaginary part of the number is"+image);;
	}
}
