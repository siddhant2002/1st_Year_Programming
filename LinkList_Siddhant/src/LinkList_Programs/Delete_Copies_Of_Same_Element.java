package LinkList_Programs;
import java.util.*;
public class Delete_Copies_Of_Same_Element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Guni start=null,prev=null,fresh,ptr;
		int ch;
		do
		{
			fresh=new Guni();
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
		Delete nm=new Delete();
		nm.delete(start);
	}
}
	class Guni
	{
		int data;
		Guni next;
	}
	class Delete
	{
		public static void delete(Guni start)
		{
			if(start==null)
				System.out.println("Underflow");
			Guni ptr,k,p;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				for(k=ptr,p=ptr.next;p!=null;p=p.next)
				{
					if(ptr.data==p.data)
						k.next=p.next;
					else
						k=p;
				}
			}
			System.out.println("The updated link list is");
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.print(ptr.data+" ");
			}
		}
	}
