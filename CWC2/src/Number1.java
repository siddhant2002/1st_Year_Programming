import java.util.*;
public class Number1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter number of elements to be inserted");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        A nm=new A();
        System.out.println(A.minSwaps(a));
	}
}
class A
{
	static int minSwaps(int a[])
    {
		int i,m=0,j,b=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(i=0;i<a.length;i++)
        {
        	map.put(a[i],i);
        }
        Arrays.sort(a);  
        boolean k[]= new boolean[a.length];
        Arrays.fill(k,false);
        for(i=0;i<a.length;i++) 
        {
            if(k[i]||map.get(a[i]) == i)
            {
            	continue;
            }
            j=i;
            while(!k[j]) 
            {
                k[j]=true;
                j=map.get(a[j]);
                b++;
            }
            if(b>0) 
            {
            	m+=(b-1);
            }
        }
        return m;
    }
}
  
