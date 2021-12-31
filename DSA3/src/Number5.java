import java.util.*;
public class Number5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the elements to be inserted");
		n=sc.nextInt();
		Object a[]=new Object[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("The elements are ");
		Number5.<Object> printArray(a);
	}
	public static < E > void printArray(E[] inputArray)
	{
		 for(E i:inputArray)
		 {
			 System.out.print(i+" ,");
		 }
	}
}
