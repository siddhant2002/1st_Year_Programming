import java.util.*;
public class Number3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		makingAnagrams(s,s1);
	}
	public static void makingAnagrams(String s1, String s2) {
        int i,j,k=0,k1;
        ArrayList<Character>c1=new ArrayList<Character>();
        ArrayList<Character>c2=new ArrayList<Character>();
        for(i=0;i<s1.length();i++)
        {
            c1.add(s1.charAt(i));
        }
        for(i=0;i<s2.length();i++)
        {
            c2.add(s2.charAt(i));
        }
            for(i=0;i<c1.size();i++)
            {
            	System.out.print(c1.get(i)+" ");
            }
            System.out.println();
            for(i=0;i<c2.size();i++)
            {
            	System.out.print(c2.get(i)+" ");
            }
            k1=c2.size();
        }
    }
