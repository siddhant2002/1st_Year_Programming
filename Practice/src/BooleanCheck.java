import java.util.*;
public class BooleanCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String k="This is my java program";
		String k1="is ";
		if(k.substring(5,7)=="is")
			System.out.println("true");
		else
			System.out.println("false");
		if(k.substring(5,8)==k1)
			System.out.println("true");
		else
			System.out.println("false");
		if(k.substring(5,8).equals(k1))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
