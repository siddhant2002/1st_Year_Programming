import java.util.*;
public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n1,n2;
		System.out.println("Enter two numbers");
		n1=sc.next();
		n2=sc.next();
		int i,j,k=0,k1=0,m,y=0,z;
        String p="",q,r;
        char c,c1;
        m=Math.min(n1.length(),n2.length());
        z=Math.max(n1.length(),n2.length());
        r=z==n1.length()?n1:n2;
        m--;
        z--;
        for(i=n1.length()-1,j=n2.length()-1;m>=0;i--,j--,m--,z--)
        {
            c=n1.charAt(i);
            c1=n2.charAt(j);
            k=Integer.parseInt(String.valueOf(c));
            k1=Integer.parseInt(String.valueOf(c1));
            k=k+k1+y;
            if(k>=10)
            {
                q=String.valueOf(k);
                c=q.charAt(q.length()-1);
                y=Integer.parseInt(q.substring(0,q.length()-1));
                p=c+p;
            }
            else
            {
            	p=k+p;
            	y=0;
            }
        }
        System.out.println(p+" "+y);
        if(i==j)
        {
        	if(y>0)
        	p=y+p;
        	System.out.println(p);
        }
        else
        {
        	for(;z>=0;z--)
        	{
        		c=r.charAt(z);
        		k=Integer.parseInt(String.valueOf(c));
        		k=k+y;
        		if(k>=10)
                {
                    q=String.valueOf(k);
                    c=q.charAt(q.length()-1);
                    y=Integer.parseInt(q.substring(0,q.length()-1));
                    p=c+p;
                }
        		else
        		{
        			y=0;
        			p=k+p;
        		}
        	}
        	if(y>0)
        		p=y+p;
        	if(n1.length()==n2.length())
            	System.out.println(p.substring(1));
            else
            	System.out.println(p);
        }
	}
}
