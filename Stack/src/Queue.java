import java.util.*;
public class Queue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,ch,dup;
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> ag=new ArrayList<Integer>();
		String i1;
		do
		{
			System.out.println("Enter the age of the patient");
			i=sc.nextInt();
			ag.add(i);
			System.out.println("Enter the entry timing");
			i1=sc.next();
			list.add(i1);
			System.out.println("Press 1 to continue for the next pateint");
			ch=sc.nextInt();
		}while(ch==1);
		String n[]=new String[ag.size()];
		int a[]=new int[ag.size()];
		for(i=0;i<a.length;i++)
		{
			n[i]=list.get(i);
			a[i]=ag.get(i);
		}
		for(i=0;i<a.length;i++)
		{
			for(ch=0;ch<a.length-1;ch++)
			{
				if(a[ch]<a[ch+1])
				{
					dup=a[ch];
					a[ch]=a[ch+1];
					a[ch+1]=dup;
					i1=n[ch];
					n[ch]=n[ch+1];
					n[ch+1]=i1;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"    "+n[i]);
		}
	}
}
