import java.util.*;
public class ArrayDelete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,pos;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position from where the number is to deleted");
		pos=sc.nextInt();
		pos--;
		for(i=pos;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("The new array is ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
