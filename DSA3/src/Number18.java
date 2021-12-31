import java.util.*;
public class Number18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of disc");
		n=sc.nextInt();
		towerOfHanoi(n,'A','C','B');
	}
	static void towerOfHanoi(int n , char a , char b , char c)
	{
		if (n==1)
		{
			System.out.println("Move disk 1 from rod "+a+" to rod "+b);
			return;
		}
		towerOfHanoi(n-1,a,c,b);
		System.out.println("Move disk "+ n + " from rod " +a+" to rod " +b);
		towerOfHanoi(n-1,c,b,a);
	}
}