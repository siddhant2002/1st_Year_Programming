import java.util.*;
public class IndexPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j,m=0,y=0;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		        int b[]=new int[n];
		        for(i=0;i<b.length;i++)
		        {
		            b[i]=sc.nextInt();
		        }
		        int c[]=new int[b.length];
		        int d[]=new int[b.length];
		        for(i=0;i<b.length;i++)
		        {
		            n=b[i];
		            for(j=0;j<m;j++)
		            {
		                if(c[j]==n)
		                break;
		            }
		            if(j==m)
		            {
		                c[m]=n;
		                d[m++]=1;
		            }
		            else
		            d[j]=d[j]+1;
		        }
		        for(i=0;i<m-1;i++)
		        {
		            for(j=0;j<m-i-1;j++)
		            {
		                if(d[j]<d[j+1])
		                {
		                    n=c[j];
		                    c[j]=c[j+1];
		                    c[j+1]=n;
		                    n=d[j];
		                    d[j]=d[j+1];
		                    d[j+1]=n;
		                }
		            }
		        }
		        n=d[0];
		        for(i=1;i<m;i++)
		        {
		            if(d[i]>n)
		            {
		                j=i;
		                n=d[i];
		            }
		        }
		        for(i=0;i<m;i++)
		        {
		        	System.out.println(c[i]+"   "+d[i]);
		        }
		        int e[]=new int[m-1];
		        n=c[m-1];
		        for(i=0;i<m-1;i++)
		        {
		            if((Math.abs(n-c[i])<=1))
		            {
		                e[y++]=d[m-1]+d[i];
		            }
		        }
		        for(i=0;i<y-1;i++)
		        {
		            for(j=0;j<y-i-1;j++)
		            {
		                if(e[j]>e[j+1])
		                {
		                    n=e[j];
		                    e[j]=e[j+1];
		                    e[j+1]=n;
		            }
		        }
		    }
		        System.out.println(e[y-1]);
	}
}
