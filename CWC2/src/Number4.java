import java.util.*;
public class Number4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter a number");
		n=sc.nextInt();
		j=(int)Math.pow(n,2);
		i=(String.valueOf(n)).length();
		j=(int)(j%(Math.pow(10,i)));
		if(j==n)
			System.out.println("Automorphic number");
		else
			System.out.println("Not Automorphic number");
	}
}
