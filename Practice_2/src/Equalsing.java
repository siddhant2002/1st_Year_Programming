import java.util.*;
public class Equalsing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> nm=new ArrayList<Integer>();
		int i,k,d;
		System.out.println("Enter 4 values");
		for(i=0;i<4;i++)
		{
			nm.add(sc.nextInt());
		}
		System.out.println("Enter the division parameter");
		d=sc.nextInt();
		System.out.println("Enter the number with which division is to be done");
		k=sc.nextInt();
		System.out.println(minOperations(nm,k,d));
	}
	public static int minOperations(List<Integer> ar, int k, int d) {
        int a[]=new int[ar.size()];
        int n=a.length;
        for(int h=0;h<ar.size();h++)
        {
            a[h]=ar.get(h);
        }
        int MAX = 1000000;
    Vector<Integer> []nm = new Vector[MAX];
    for(int i = 0; i < nm.length; i++)
        nm[i] = new Vector<Integer>();
    for(int i = 0; i < n; i++)
    {
        int c = 0;
        nm[a[i]].add(0);
 
        while (a[i] > 0)
        {
            a[i] /= d;
            c++;
            nm[a[i]].add(c);
        }
    }
 
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < MAX; i++)
    {
        if (nm[i].size() >= k)
        {
            int move = 0;
 
            Collections.sort(nm[i]);
            for(int j = 0; j < k; j++)
            {
                move += nm[i].get(j);
            }
            ans = Math.min(ans, move);
        }
    }
    return ans;
	}
}


