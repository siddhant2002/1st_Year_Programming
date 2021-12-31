import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a,b;
		boolean k;
		System.out.println("Enter two strings");
		a=sc.nextLine();
		b=sc.nextLine();
		k=isAnagram(a,b);
		System.out.println(k);
	}
	static boolean isAnagram(String a, String b) {
        char c1[]=new char[a.length()];
        int c2[]=new int[a.length()];
        char c3[]=new char[b.length()];
        int c4[]=new int[b.length()];
        int i,j,m=0,k=0,p;
        char c;
        for(i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            for(j=0;j<m;j++)
            {
                if(c==c1[j])
                break;
            }
            if(j==m)
            {
                c1[m]=c;
                c2[m++]=1;
            }
            else
            {
                c2[j]=c2[j]+1;
            }
        }
        for(i=0;i<b.length();i++)
        {
            c=b.charAt(i);
            for(j=0;j<k;j++)
            {
                if(c==c3[j])
                break;
            }
            if(j==k)
            {
                c3[k]=c;
                c4[k++]=1;
            }
            else
            {
                c4[j]=c4[j]+1;
            }
        }
        for(i=0;i<m-1;i++)
        {
            for(j=0;j<m-1-i;j++)
            {
                if(c1[j]>c1[j+1])
                {
                    c=c1[j];
                    c1[j]=c1[j+1];
                    c1[j+1]=c;
                    p=c2[j];
                    c2[j]=c2[j+1];
                    c2[j+1]=p;
                }
            }
        }
        for(i=0;i<k-1;i++)
        {
            for(j=0;j<k-1-i;j++)
            {
                if(c3[j]>c3[j+1])
                {
                    c=c3[j];
                    c3[j]=c3[j+1];
                    c3[j+1]=c;
                    p=c4[j];
                    c4[j]=c4[j+1];
                    c4[j+1]=p;
                }
            }
        }
            if(c1.length!=c3.length)
            return false;
            else
            {
                for(i=0;i<c1.length;i++)
                {
                    if(c2[i]!=c4[i])
                    break;
                }
                if(i==c1.length)
                return true;
                else
                return false;
            }
    }
}
