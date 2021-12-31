package LinkList_Programs;
import java.util.*;
public class Sort_An_Linked_List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Azam start=null,prev=null,fresh,ptr;
		int ch;
		do
		{
			fresh=new Azam();
			System.out.println("Enter a number");
			fresh.data=sc.nextInt();
			if(start==null)
				start=fresh;
			else
				prev.next=fresh;
			prev=fresh;
			System.out.println("Enter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
		Working nm=new Working();
		nm.sort(start);
	}
}
	class Azam
	{
		int data;
		Azam next;
	}
	class Working
	{
		public static void sort(Azam start)
		{
			if(start==null)
				System.out.println("Empty list");
			Azam ptr,k;
			int t;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				for(k=ptr.next;k!=null;k=k.next)
				{
					t=ptr.data;
					ptr.data=k.data;
					k.data=t;
				}
			}
			System.out.println("The sorted list is ");
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.println(ptr.data+" ");
			}
		}
	}
