import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j;
		System.out.println("Enter 100 numbers");
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
