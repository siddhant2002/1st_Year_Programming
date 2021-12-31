import java.util.*;
public class FairRations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> b=new ArrayList<>();
		System.out.println("Enter 5 numbers ");
		int i,k=0,l=0;
		for(i=0;i<5;i++)
		{
			b.add(sc.nextInt());
		}
        for(i=0;i<b.size();i++)
        {
            if(b.get(i)%2==0)
            k++;
        }
        System.out.println(k);
        int a[]=new int[b.size()];
        for(i=0;i<b.size();i++)
        {
            a[i]=b.get(i);
        }
        i=0;
        while(k!=a.length)
        {
            if(a[i]%2==1&&i<a.length-1)
            {
                a[i]=a[i]+1;
                i++;
                k++;
                a[i]=a[i]+1;
                l+=2;
                System.out.println(l);
            }
            else if(a[i]%2==1&&!(i<a.length-1))
            {
                a[i]=a[i]+1;
                i--;
                a[i]=a[i]+1;
                l+=2;
                System.out.println(l);
            }
            k=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]%2==0)
                    k++;
                System.out.println(k);
            }
        }
        System.out.println(String.valueOf(l));
	}
}
