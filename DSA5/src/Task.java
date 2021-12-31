import java.util.*;
public class Task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node fresh,start=null,next,pre=null,ptr;
		int ch;
		do
		{
			fresh=new Node();
			System.out.println("Enter the reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null) 
			{
				start=fresh;
			}
			else
			{
				pre.next=fresh;
				fresh.prev=pre;
			}
			pre=fresh;
			System.out.println("Enter 1 for next node");
			ch=sc.nextInt();
		}while(ch==1);
		Work nm=new Work();
		System.out.println("Display from front");
		nm.displayForward(start,fresh);
		System.out.println("Display from backwards");
		nm.displayBackward(fresh,fresh);
		int k;
		System.out.println(k=nm.count(start));
		System.out.println("Enter a value to be searched for");
		nm.search(start,sc.nextInt());
		nm.insertBeg(start);
		nm.insertEnd(start,fresh);
		nm.insertAnyPos(start,fresh);
		nm.deleteBeg(start);
		nm.deleteEnd(start);
		nm.deleteAnyNode(start);
		nm.search(start);
	}
}
	class Node
	{
		protected int regd_no;
		protected float mark;
		protected Node next,prev;
	}
	class Work
	{
		void displayForward(Node start , Node end)
		{
			Node ptr;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.println(ptr.regd_no+" "+ptr.mark);
			}
		}
		void displayBackward(Node start , Node end)
		{
			Node ptr;
			for(ptr=start;ptr!=null;ptr=ptr.prev)
			{
				System.out.println(ptr.regd_no+" "+ptr.mark);
			}
		}
		int count(Node start)
		{
			Node ptr;
			int c=0;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				c++;
			}
//			System.out.println("Number of nodes is "+c);
			return c;
		}
		void search(Node start , int n)
		{
			Node ptr;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				if(n==ptr.mark)
					break;
			}
			if(ptr!=null)
			{
				System.out.println("Mark found");
			}
			else
			{
				System.out.println("Mark not found");
			}
		}
		void insertBeg(Node start)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh;
			fresh=new Node();
			System.out.println("Enter the reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=fresh;
			}
			else
			{
				fresh.next=start;
				start.prev=fresh;
				start=fresh;
			}
			Node ptr;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.println(ptr.regd_no+" "+ptr.mark);
			}
		}
		void insertEnd(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh;
			fresh=new Node();
			System.out.println("Enter the reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=fresh;
			}
			else
			{
				end.next=fresh;
				fresh.prev=end;
				end=fresh;
			}
			Node ptr;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.println(ptr.regd_no+" "+ptr.mark);
			}
		}
		void insertAnyPos(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh,ptr;
			int l,c=count(start);
			System.out.println("Enter the inserted location");
			l=sc.nextInt();
			if(l>=1&&l<=c+1)
			{
				if(l==1)
					insertBeg(start);
				else if(l==c+1)
					insertEnd(start,end);
				else
				{
					fresh=new Node();
					System.out.println("Enter the reg number and mark");
					fresh.regd_no=sc.nextInt();
					fresh.mark=sc.nextFloat();
					int k;
					for(ptr=start,k=1;k<l-1;k++,ptr=ptr.next);
					fresh.prev=ptr;
					fresh.next=ptr.next;
					ptr.next=fresh;
					fresh.next.prev=fresh;
				}
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.println(ptr.regd_no+" "+ptr.mark);
				}
			}
			else
				System.out.println("Invalid Position");
		}
		void deleteBeg(Node start)
		{
			if(start==null)
				System.out.println("UnderFlow");
			else
			{
				if(start.next==null)
				{
					System.out.println("List became empty after deleting the last element");
					start=null;
				}
				else
				{
					start=start.next;
					start.prev=null;
				}
				Node ptr;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.println(ptr.regd_no+" "+ptr.mark);
				}
			}
		}
		void deleteEnd(Node start)
		{
			if(start==null)
				System.out.println("OverFlow");
			else
			{
				if(start.next==null)
				{
					System.out.println("List became empty after deleting the last element");
					start=null;
				}
				else
				{
					Node ptr;
					for(ptr=start;ptr.next.next!=null;ptr=ptr.next);
					ptr.next=null;
					for(ptr=start;ptr!=null;ptr=ptr.next)
					{
						System.out.println(ptr.regd_no+" "+ptr.mark);
					}
				}
			}
		}
		void deleteAnyNode(Node start)
		{
			Scanner sc=new Scanner(System.in);
			if(start==null)
				System.out.println("UnderFlow");
			int l;
			System.out.println("Enter the deleted position");
			l=sc.nextInt();
			if(l>=1&&l<=count(start))
			{
				if(l==1)
					deleteBeg(start);
				else if(l==count(start))
					deleteEnd(start);
				else
				{
					Node ptr,fresh;
					int c=0;
					for(ptr=start,c=1;c<l-1;c++,ptr=ptr.next);
					ptr.next.next.prev=ptr;
					ptr.next=ptr.next.next;
					for(ptr=start;ptr!=null;ptr=ptr.next)
					{
						System.out.println(ptr.regd_no+" "+ptr.mark);
					}
				}
			}
			else
				System.out.println("Invalid Position");
		}
		void search(Node start)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a mark which is to be searched and enter the updated one");
			float mark=sc.nextFloat();
			float k=sc.nextFloat();
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Node ptr;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(mark==ptr.mark)
					{
						ptr.mark=k;
						System.out.println("The reg number is "+ptr.regd_no+" and the updated mark is "+ptr.mark);
						break;
					}
				}
				if(ptr==null)
					System.out.println("Inputted mark not found");
			}
		}
	}
