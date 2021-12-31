import java.util.*;
public class Assignment4_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		System.out.println("Enter a number for which you want to display the multiplication table ");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n +"*"+ i +"="+ (n*i));
		}
	}
}
