import java.util.*;
public class Raunak1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int i,j,m=0;
		System.out.println("Enter a string");
		s=sc.nextLine();
		String p[]=s.split("(' ' , . ? ! )");
		for(i=0;i<p.length;i++)
			System.out.println(p[i]);
		String q[]=new String[p.length];
		int a[]=new int[p.length];
		for(i=0;i<p.length;i++)
		{
			for(j=0;j<m;j++)
			{
				if(p[i].equals(q[j]))
					break;
			}
			if(j==m)
			{
				q[m]=p[i];
				a[m++]=1;
			}
			else
				a[j]=a[j]+1;
		}
//		System.out.println("Enter a word to be searched");
//		s=sc.nextLine();
		for(i=0;i<m;i++)
		{
			System.out.println(q[i]+" "+a[i]);
//			if(s.equals(q[i]))
//			{
//			    System.out.println("The frequency of "+s+" in the string is "+a[i]);
//				break;
//			}
		}
//		if(i==m)
//			System.out.println("Inputted word not found");
	}
}
