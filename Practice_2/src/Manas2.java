import java.util.*;
public class Manas2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter number of lines you want");
		n=sc.nextInt();
		ArrayList<Integer> nm=new ArrayList<>();
		if(n==1)
			System.out.println("1");
		else if(n==2)
		{
			System.out.println(" 1\n1 1");
			nm.add(1);
			nm.add(1);
		}
		else
		{
			nm.add(1);
			nm.add(1);
			for(int h=1;h<n;h++)
			{
				System.out.print(" ");
			}
			System.out.println("1");
			for(int h=1;h<n-1;h++)
			{
				System.out.print(" ");
			}
			System.out.println("1 1");
			int k,b,p,i;
			for(i=3;i<=n;i++)
			{
				ArrayList<Integer> kk=new ArrayList<>();
				for(b=1;b<(n+1)-i;b++)
				{
					System.out.print(" ");	
				}
				System.out.print(1+" ");
				kk.add(1);
				for(p=0;p<nm.size()-1;p++)
				{
					System.out.print(nm.get(p)+nm.get(p+1)+" ");
					kk.add(nm.get(p)+nm.get(p+1));
				}
				System.out.print(1+" ");
				kk.add(1);
				System.out.println();
				nm=kk;
			}
		}
	}
}
