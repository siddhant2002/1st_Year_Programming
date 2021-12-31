import java.util.*;
public class Assignment3_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,a1,b1;
		System.out.println("Enter 3 integers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		a1=Math.min(a,Math.min(b,c));
		b1=Math.max(a,Math.max(b,c));
		System.out.println("The numbers in decreasing order is "+ b1+" "+((a+b+c)-(a1+b1))+" "+a1);
	}
}
