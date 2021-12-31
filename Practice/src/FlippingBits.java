import java.util.*;
public class FlippingBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long dup,n;
        int d,i,m=0;
        char c;
        String p="",s="";
        n=sc.nextLong();
        dup=n;
        while(dup!=0)
        {
            d=(int)dup%2;
            s=s+d;
            dup/=2;
        }
        for(i=s.length();i<32;i++)
        {
            s=s+"0";
        }
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            p=c+p;
        }
        System.out.println(p);
        s="";
        for(i=0;i<p.length();i++)
        {
            c=p.charAt(i);
            if(c=='1')
            s=s+"0";
            else if(c=='0')
            s=s+"1";
        }
        System.out.println(s);
        dup=0;
        for(i=s.length()-1;i>=0;i--,m++)
        {
        	c=s.charAt(i);
        	if(c=='1')
        	{
        		dup=dup+(1*(int)Math.pow(2,m));
        	}
        	else
        		dup=dup+0;
        }
        System.out.println("The sum is "+dup);
   }

}
