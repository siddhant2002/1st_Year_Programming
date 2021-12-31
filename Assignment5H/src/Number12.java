import java.util.*;
public class Number12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,k,k1,k2,k3,i,i1;
		System.out.println("Enter two numbers ");
		n=sc.nextInt();
		n1=sc.nextInt();
		k=5*n*n+4;
		k1=5*n*n-4;
		k2=5*n1*n1+4;
		k3=5*n1*n1-4;
		i=(int)(Math.sqrt(k));
		i1=(int)(Math.sqrt(k1));
		if((i*i==k)||(i1*i1==k1))
			System.out.println(n+" is a fibonacci number");
		else
			System.out.println(n+" is not a fibonacci number");
		i=(int)(Math.sqrt(k2));
		i1=(int)(Math.sqrt(k3));
		if((i*i==k2)||(i1*i1==k3))
			System.out.println(n1+" is a fibonacci number");
		else
			System.out.println(n1+" is not a fibonacci number");
	}
}
