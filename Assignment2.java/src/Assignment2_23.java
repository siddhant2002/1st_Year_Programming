import java.util.Scanner;

public class Assignment2_23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,a1,b1,c1;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		a1=Math.min(a,(Math.min(b,c)));
		b1=Math.max(a,(Math.max(b,c)));
		c1=(a+b+c)-(a1+b1);
		System.out.println("Ascending sequence is: "+a1+" "+c1+" "+b1);
		System.out.println("Decending sequence is: "+b1+" "+c1+" "+a1);
	}

}
