import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a number which is to be searched");
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(k==a[i])
				break;
		}
		if(i==n)
			System.out.println("Sorry number is not found");
		else
			System.out.println("Number is found in "+i+" index position");
	}
}
