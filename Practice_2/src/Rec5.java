import java.util.*;
public class Rec5 {

	public static void main(String[] args) {
		display(10);
	}
	static void print(int n)
	{
		if(n==0)
			return;
		else
		{
			display(n-1);
			System.out.print(n+" ");
		}
	}
	static void display(int n)
	{
		print(n-1);
	}
}
