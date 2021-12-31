import java.util.*;
public class PN_1925 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		double k;
        int c=0,i,j;
        for(i=1;i<n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                k=(i*i)+(j*j);
                int l=(int)k;
                k=(int)Math.sqrt(k);
                if(k==Math.sqrt((i*i)+(j*j))&&k<=n)
                {
                	System.out.println(i+" "+j+" "+k);
                }
            }
        }
	}

}
