import java.util.*;
public class MCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p;
		System.out.println("Enter a string");
		p=sc.nextLine();
		String n[]=new String[1];
		n[0]="a";
		System.out.println(mostCommonWord(p,n));
	}
	public static String mostCommonWord(String p, String[] b) {
		p=p.toLowerCase();
        p=p.replaceAll(","," ");
        int i,l=0,j=0,d;
        char c;
        String s="";
        ArrayList<String> nm=new ArrayList<String>();
        for(i=0;i<p.length();i++)
        {
            c=p.charAt(i);
            if(c>='a'&&c<='z')
                s=s+c;
            else if(c==' '&&s.length()>0)
            {
            	nm.add(s);
            	s="";
            }
        }
        nm.add(s);
        String n[]=new String[nm.size()];
        for(i=0;i<nm.size();i++)
             n[i]=nm.get(i);
        String no[]=new String[n.length];
        int nu[]=new int[n.length];
        for(i=0;i<n.length;i++)
        {
            for(j=0;j<l;j++)
            {
                if(no[j].equals(n[i]))
                    break;
            }
            if(j==l)
            {
                no[l]=n[i];
                nu[l++]=1;
            }
            else
                nu[j]=nu[j]+1;
        }
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-i-1;j++)
            {
                if(nu[j]<nu[j+1])
                {
                    d=nu[j];
                    nu[j]=nu[j+1];
                    nu[j+1]=d;
                    s=no[j];
                    no[j]=no[j+1];
                    no[j+1]=s;
                }
            }
        }
        for(i=0;i<l;i++)
        {
        	s=no[i];
        	for(j=0;j<b.length;j++)
        	{
        		if(b[j].equals(s))
        			break;
        	}
        	if(j==b.length)
        		break;
        }
        return s;
    }
}
