import java.util.*;
public class Method10 {

	public static void main(String[] args) {
		System.out.println("The maximum integer is "+ Integer.MAX_VALUE);
		System.out.println("The minimum positive float is "+ Float.MIN_VALUE);
		System.out.println("The minimum integer is "+ Integer.MIN_VALUE);
		System.out.println("The maximum positive float is "+ Float.MAX_VALUE);
		System.out.println(new Double(13.4).compareTo(new Double(11.3)));
		System.out.println(new Double(10.4).compareTo(new Double(14.3)));
		int aa=10;
		Integer x=Integer.valueOf(aa);
		Integer y=aa;
		System.out.println(aa+" "+x+" "+y);
		Integer a=new Integer(25);
		Integer x1=a.intValue();
		int y1=a;
		System.out.println(a+" "+x1+" "+y1);
	}

}
