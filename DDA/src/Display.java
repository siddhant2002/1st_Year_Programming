import java.util.*;

public class Display {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,i,j;
		System.out.println("Enter number of rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter number of rows and columns");
		r=sc.nextInt();
		c=sc.nextInt();
		int a1[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a1[i][j]=(int)(Math.random()*100);
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
