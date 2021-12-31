import java.util.*;
public class Assignment2_14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,n1;
		n=Integer.parseInt(args[0]);
		n1=Integer.parseInt(args[1]);
		if((n%n1==0)||(n1%n==0))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
