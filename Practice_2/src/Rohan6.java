import java.util.*;
public class Rohan6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,c,f=0;
		System.out.println("Enter a number");
		n=sc.nextInt();
		ArrayList<Integer> nm=new ArrayList<>();
		nm.add(2);
		for(i=3;i<n;i+=2)
		{
			c=0;
			for(j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0)
				nm.add(i);
		}
		for(i=0;i<nm.size();i++)
		{
			for(j=0;j<nm.size();j++)
			{
				if(nm.get(i)+nm.get(j)==n)
				{
					f=1;
					break;
				}
			}
			if(f==1)
				break;
		}
		if(f==0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
