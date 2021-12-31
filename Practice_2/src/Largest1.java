import java.util.*;

public class Largest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n;
		System.out.println("Enter a number");
		n=sc.next();
		n=n.trim();
        if(n.length()==0||Integer.parseInt(n)%2==0)
            System.out.println("");
        else if(Integer.parseInt(n)%2==1)
            System.out.println(n);
        else
        {
            int i;
            ArrayList<Integer> nm=new ArrayList<>();
            char c;
            String s="";
            for(i=0;i<n.length();i++)
            {
                c=n.charAt(i);
                if(Integer.parseInt(String.valueOf(c))%2==1)
                    nm.add(Integer.parseInt(String.valueOf(c)));
            }
            System.out.println(nm);
            Collections.sort(nm);
            System.out.println(nm);
            for(i=nm.size()-1;i>=0;i--)
            {
                s=s+nm.get(i);
            }
            System.out.println(s);
        }
	}
}
