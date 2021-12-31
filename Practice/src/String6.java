import java.util.*;
public class String6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s12 ="Banana Panama Vikrama Akram Dwakra";
		String s1=new String("853");
		int n=Integer.parseInt(s1);
		String st2=(s1+n).substring(3)+"HI";
		System.out.println(st2);
		System.out.print(s12.indexOf("na"));
		System.out.print(s12.indexOf("na", s12.indexOf("na")));
		System.out.print(s12.lastIndexOf("na"));
		System.out.print(s12.lastIndexOf("akr"));
		System.out.print(s12.lastIndexOf("akr",29));
		System.out.println(s12.substring(s12.indexOf("ik")-1, s12.lastIndexOf("wa")-s12.indexOf("Pana")-1));
		System.out.println();
		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println(myStr.indexOf('e',41));
		s1 = "HELLO ITERIANS";
		String s2 = " Hello Iterians ";
		System.out.println(s1.equals(s2.trim()));
		System.out.println(s1.equalsIgnoreCase(s2.trim()));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		s1 = "Hello";
		s2 = "Hello";
		String s3 = new String("Hello");
		if(s1 == s2 ) {
		if(s1 == s3)
		System.out.println("s1, s2 and s3 are references to the same string object.");
		else
		System.out.println("s1 and s2 are references to the same string object but not s3");
		}
		else
		System.out.println("s1 and s2 are references to two different string object.");
		boolean k=true;
		int x=5;
		x=+5;
		x+=5;
		System.out.println(x);
		System.out.println(x);
		int y=012;
		System.out.println(Math.min(6,9));
	}
}
