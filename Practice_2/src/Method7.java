import java.util.*;
public class Method7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,c,c1=0,c2,c3=0,k=0,l=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		int a[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			c=0;c2=0;
			for(j=0;j<n;j++)
			{
				if(a[i][j]==1)
					c++;
				if(a[j][i]==1)
					c2++;
			}
			if(c>c1)
			{
				c1=c;
				k=i;
			}
			if(c2>c3)
			{
				c3=c1;
				l=i;
			}
		}
		System.out.println("The largest row is index "+k+" with "+c1+" number of 1's");
		System.out.println("The largest column is index "+l+" with "+c3+" number of 1's");
	}
}
