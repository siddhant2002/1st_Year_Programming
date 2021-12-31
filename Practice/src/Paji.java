import java.util.ArrayList;
import java.util.*;

public class Paji
{
	public static void main(String args[])
	{
		ArrayList<Integer> nm=new ArrayList<>();
		int i,n,s=0;
		String p="";
		nm.add(9);
		nm.add(5);
		nm.add(8);
		for(i=nm.size()-1;i>=0;i--)
		{
			p=p+nm.get(i);
		}
		n=Integer.parseInt(p);
		ArrayList<Integer> kk=new ArrayList<>();
		while(n!=0)
		{
			kk.add(n%10);
			Collections.sort(kk);
			for(i=0;i<kk.size();i++)
			{
				s=s+((kk.get(i))*(i+1));
			}
			System.out.println(s);
			n/=10;
		}
		System.out.println(s%(((int)(Math.pow(10,7)))+7));
	}
}
