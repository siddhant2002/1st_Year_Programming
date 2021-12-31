import java.util.*;
public class SentenceSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.trim();
        int a[]=new int[s.length()];
        String b[]=new String[a.length];
        int i,j=0,m;
        char c;
        String p;
        for(i=0,m=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>='0'&&c<='9')
            {
                b[j]=s.substring(m,i);
                a[j++]=c;
            }
            else if(c==' ')
            {
                m=i+1;
            }
        }
        for(i=0;i<j-1;i++)
        {
            for(m=0;m<j-i-1;m++)
            {
                if(a[m]>a[m+1])
                {
                    c=(char)a[m];
                    a[m]=a[m+1];
                    a[m+1]=c;
                    p=b[m];
                    b[m]=b[m+1];
                    b[m+1]=p;
                }
            }
        }
        p="";
        for(i=0;i<j-1;i++)
        {
            p=p+b[i];
            p=p+" ";
        }
        p=p+b[i];
        System.out.println(p);
	}
}
