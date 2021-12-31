import java.util.*;
public class Scaler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[51];
		int b,i;
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();		
		}
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("The number is "+ solve(a,b));
	}
		    public static int solve(int[] A, int B) {
		        int i,j,k,s,n,c=0;
		        ArrayList<Integer> ar=new ArrayList<Integer>();
		        for(i=0;i<A.length-2;i++)
		        {
		            for(j=i+1;j<A.length-1;j++)
		            {
		                for(k=j+1;k<A.length;k++)
		                 {
		                    s=A[i]+A[j]+A[k];
		                    ar.add(s);
		                }
		            }
		        }
		        Collections.sort(ar);
		        return ar.get(B);
		    }
}
