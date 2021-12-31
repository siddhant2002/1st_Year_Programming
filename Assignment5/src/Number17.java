import java.util.*;
public class Number17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double root=0,x,n;
		System.out.println("Enter a number");
		n=sc.nextDouble();
		for(x=n;Math.abs(root-x)<0.0001;x=root)
		{
			root=0.5*(x+(n/x));
		}
		System.out.println("The squareroot of "+n+" using newton's method is "+root);
	}

}
