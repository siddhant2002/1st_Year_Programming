import java.util.*;
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter a string");
		s=sc.nextLine();
		ArrayList<Integer> nm=new ArrayList<>();
        int i,m=0;
        char c;
        String k="";
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>'0'&&c<='9')
                nm.add(i);
        }
        ArrayList<Integer> kk=new ArrayList<>();
        for(i=1;i<nm.size();i++)
        {
            if(nm.get(i)-nm.get(i-1)==1)
            	k=k+s.charAt(nm.get(i-1));
            else
            {
            	k=k+s.charAt(nm.get(i-1));
                kk.add(Integer.parseInt(k));
                k="";
            }
        }
        if(nm.size()>1)
        {
        	k=k+s.charAt(nm.get(nm.size()-1));
            kk.add(Integer.parseInt(k));
            Collections.sort(kk);
            for(i=0;i<kk.size()-1;i++)
            {
                if(kk.get(i)==kk.get(i+1))
                    continue;
                else
                	m++;
            }
            m++;
    		System.out.println(m);
        }
        else
        	System.out.println(0);
	}
}
