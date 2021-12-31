package LinkList_Programs;
import java.util.*;
public class Delete_Elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Aza start=null,prev=null,fresh,ptr;
		int ch;
		do
		{
			fresh=new Aza();
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
		M nm=new M();
		start=nm.DelAny(start);
		for(Aza ptr1=start;ptr1!=null;ptr1=ptr1.next)
		{
			System.out.print(ptr1.data+" ");
		}
	}
}
	class Aza
	{
		int data;
		Aza next;
	}
	class M
	{
		public static Aza DelBeg(Aza start)
		{
			if(start==null)
			{
				System.out.println("UnderFlow");
				return start;
			}
			else
			{
				start=start.next;
				return start;
			}
		}
		public static Aza DelEnd(Aza start)
		{
			if(start==null)
			{
				System.out.println("UnderFlow");
				return start;
			}
			else if(start.next==null)
			{
				return DelEnd(start);
			}
			else
			{
				Aza ptr;
				for(ptr=start;ptr.next.next!=null;ptr=ptr.next);
				{
					ptr.next=null;
				}
				return start;
			}
		}
		public static Aza DelAny(Aza start)
		{
			Scanner sc=new Scanner(System.in);
			Aza ptr;
			int c,p=0;
			System.out.println("Enter the deletion position");
			c=sc.nextInt();
			if(start==null)
			{
				System.out.println("UnderFlow");
				return start;
			}
			else if(c>count(start))
			{
				System.out.println("Not a valid position");
				return start;
			}
			else if(c==count(start)+1)
			{
				return DelEnd(start);
			}
			else
			{
				for(ptr=start;ptr.next!=null;ptr=ptr.next)
				{
					p++;
					if(p==c-1)
						break;
				}
				ptr.next=ptr.next.next;
				return start;
			}
		}
		public static int count(Aza start)
		{
			if(start==null)
				System.out.println("Empty list");
			int c=0;
			for(Aza ptr=start;ptr!=null;ptr=ptr.next)
			{
				c++;
			}
			return c;
		}
	}
