import java.util.*;
public class Method9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		String p="";
        int i,l,j;
        char c;
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                p=c+p;
        }
        System.out.println(p);
        j=0;
        String s1="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                s1=s1+p.charAt(j);
                j++;
            }
            else
                s1=s1+c;
        }
        System.out.println(s1);
	}
}
