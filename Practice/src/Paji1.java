import java.util.*;
public class Paji1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		String p,q;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		p=Integer.toBinaryString(a);
		q=Integer.toBinaryString(b);
		a=a&b;
		if(a==(Math.pow(a/2,2)))
			System.out.println(a);
		else
			System.out.println("Not there");
		Double p1=25.0;
        p1=p1/0;
        System.out.println(p1);
	}
}
