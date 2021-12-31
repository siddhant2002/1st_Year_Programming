import java.util.*;
public class Assignment2_17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if((a>=(b+c))||(b>=(a+c))||(c>=(a+b)))
			System.out.println("true");
		else 
			System.out.println("false");
	}

}
