import java.util.*;
public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,size,index;
		System.out.println("Enter the size of the array ");
		size=sc.nextInt();
		int a[]=new int[size+1];
		System.out.println("Enter "+size +" numbers");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position where the number is to be inserted ");
		index=sc.nextInt();
		System.out.println("Enter the number which is to inserted");
		n=sc.nextInt();
		for(i=size;i>=index;i--)
		{
			a[i]=a[i-1];
		}
		a[i]=n;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
