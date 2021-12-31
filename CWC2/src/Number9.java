import java.util.*;
public class Number9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		StringBuffer n=new StringBuffer();
		n.append(s);
		n.reverse();
		System.out.println("The string "+s+" in reverse form is "+n.toString());
	}
}
