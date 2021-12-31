import java.util.*;
public class Hk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,n;
		System.out.println("Enter the value of n , a and b");
		n=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		int i,j,k,m,s=0;
        k=(int)(Math.ceil(Math.sqrt((Math.pow(n,2)))));
        System.out.println(k);
        ArrayList<Integer> nm=new ArrayList<Integer>();
        for(i=0;i<k;i++)
        {
            s=0;
            for(j=1;j<n-i;j++)
            {
                s=s+a;
            }
            for(m=j;m<n;m++)
            {
                s=s+b;
            }
            nm.add(s);
            System.out.print(s+" ");
        }
        System.out.println(nm.size());
        ArrayList<Integer> kk=new ArrayList<>();
        for(i=0;i<nm.size()-1;i++)
        {
            if(nm.get(i)==nm.get(i+1))
            continue;
            else
            kk.add(nm.get(i));
        }
        kk.add(nm.get(i));
        System.out.println(kk.size());
        for(i=0;i<kk.size();i++)
        	System.out.println(kk.get(i)+" ");
	}
}
