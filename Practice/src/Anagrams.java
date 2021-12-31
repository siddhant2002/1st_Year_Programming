import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b;
		int i,j,m=0,m1=0;
		char c1;
		System.out.println("Enter two strings ");
		a=sc.nextLine();
		b=sc.nextLine();
		char c[]=new char[a.length()];
        int k[]=new int[a.length()];
        char d[]=new char[b.length()];
        int k1[]=new int[b.length()];
        for(i=0;i<a.length();i++)
        {
            c1=a.charAt(i);
            for(j=0;j<m;j++)
            {
                if(c1==c[j])
                break;
            }
            if(j==m)
            {
                c[m]=c1;
                k[m++]=1;
            }
            else
            k[j]=k[j]+1;
        }
        for(i=0;i<m;i++)
        {
        	System.out.println(c[i]+"    "+k[i]);
        }
        for(i=0;i<b.length();i++)
        {
            c1=b.charAt(i);
            for(j=0;j<m1;j++)
            {
                if(c1==d[j])
                break;
            }
            if(j==m1)
            {
                d[m1]=c1;
                k1[m1++]=1;
            }
            else
            k1[j]=k1[j]+1;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(i=0;i<m1;i++)
        {
        	System.out.println(d[i]+"    "+k1[i]);
        }
	}
}
