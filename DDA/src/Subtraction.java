import java.util.*;

public class Subtraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c,i,j;
		System.out.println("Enter number of rows and columnns of the 1st array");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("The values of the 1st array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter number of rows and columnns of the 2st array");
		r=sc.nextInt();
		c=sc.nextInt();
		int a1[][]=new int[r][c];
		System.out.println("The values of the 2nd array is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a1[i][j]=(int)(Math.random()*100);
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		int a2[][]=new int[r][c];
		System.out.println("The subtraction of the arrays are ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a2[i][j]=a[i][j]-a1[i][j];
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
