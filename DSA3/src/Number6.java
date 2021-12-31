import java.util.*;
public class Number6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		Object n1;
		System.out.println("Enter the elements to be inserted");
		n=sc.nextInt();
		Object a[]=new Object[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Enter a number which is to be searched");
		n1=sc.next();
		count(a, n1);
	}
	public static <T> void count(T[] array, T item)
	{
		for(T i: array)
		{
			if(Integer.parseInt(item.toString())==Integer.parseInt(i.toString()))
				System.out.println("Found");
			else
				System.out.println("Not found");
		}
	}
}
