import java.util.*;
public class Rec1 {

	public static void main(String[] args) {
		poo(10);
	}
	static int poo(int n)
	{
		if(n==0)
			return n;
		System.out.println(n);
		return poo(n-1);
	}
}
