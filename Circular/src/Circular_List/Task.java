package Circular_List;
import java.util.*;
public class Task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Node start=null,prev=null,fresh,ptr;
		int ch,c=0,p;
		do
		{
			fresh=new Node();
			System.out.println("Enter the Registration number");
			fresh.regd_no=sc.nextInt();
			System.out.println("Enter the mark secured");
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=fresh;
			}
			else
			{
				prev.next=fresh;
				prev.next.next=start;
			}
			prev=fresh;
			System.out.println("Enter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
		Work nm=new Work();
		int l;
		do
		{
			System.out.println("Press 1 to insert a element at the beginning of a LinkList");
			System.out.println("Press 2 to insert a element at the end of a LinkList");
			System.out.println("Press 3 to insert a element at any position of a LinkList");
			System.out.println("Press 4 to delete a element at the beginning of a LinkList");
			System.out.println("Press 5 to delete a element at the end of a LinkList");
			System.out.println("Press 6 to delete a element at any position of a LinkList");
			System.out.println("Press 7 to delete a element based on the registration number");
			System.out.println("Press 8 to update the mark of a student");
			System.out.println("Press 9 to sort from higher marks to lower marks");
			System.out.println("Press 10 to count number of nodes in the LinkList ");
			System.out.println("Press 11 to Reverse the LinkList");
			System.out.println("Press 12 to display the LinkList");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				start=nm.InsBeg(start,fresh);
				Node tr=start;
				System.out.println(tr.regd_no+" "+tr.mark);
				for(tr=start.next;tr!=start;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 2:
				start=nm.InsEnd(start,fresh);
				Node tr1=start;
				System.out.println(tr1.regd_no+" "+tr1.mark);
				for(tr1=start.next;tr1!=start;tr1=tr1.next)
				{
					System.out.println(tr1.regd_no+" "+tr1.mark);
				}
				break;
			case 3:
				start=nm.InsAny(start,fresh);
				Node tr2=start;
				System.out.println(tr2.regd_no+" "+tr2.mark);
				for(tr2=start.next;tr2!=start;tr2=tr2.next)
				{
					System.out.println(tr2.regd_no+" "+tr2.mark);
				}
				break;
			case 4:
				start=nm.DelBeg(start,fresh);
				Node tr3=start;
				System.out.println(tr3.regd_no+" "+tr3.mark);
				for(tr3=start.next;tr3!=start;tr3=tr3.next)
				{
					System.out.println(tr3.regd_no+" "+tr3.mark);
				}
				break;
			case 5:
				start=nm.DelEnd(start,fresh);
				Node tr4=start;
				System.out.println(tr4.regd_no+" "+tr4.mark);
				for(tr4=start.next;tr4!=start;tr4=tr4.next)
				{
					System.out.println(tr4.regd_no+" "+tr4.mark);
				}
				break;
			case 6:
				start=nm.DelAny(start,fresh);
				Node tr5=start;
				System.out.println(tr5.regd_no+" "+tr5.mark);
				for(tr5=start.next;tr5!=start;tr5=tr5.next)
				{
					System.out.println(tr5.regd_no+" "+tr5.mark);
				}
				break;
			case 7:
				nm.DelReg(start,fresh);
				break;
			case 8:
				nm.search(start,fresh);
				break;
			case 9:
				nm.sort(start,fresh);
				break;
			case 10:
				System.out.println("Number of nodes is "+(nm.count(start,fresh)));
				break;
//			case 11:
//				start=nm.reverse(start,fresh);
//				Node tr6=start;
//				System.out.println(tr6.regd_no+" "+tr6.mark);
//				for(tr6=start.next;tr6!=fresh.next;tr6=tr6.next)
//				{
//					System.out.println(tr6.regd_no+" "+tr6.mark);
//				}
//				break;
			case 12:
				nm.display(start,fresh);
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Press 1 to do next operation else press any number to terminate");
			p=sc.nextInt();
		}while(p==1);
	}
}
	class Node
	{
		protected int regd_no;
		protected float mark;
		protected Node next;
	}
	class Work
	{
		public static Node InsBeg(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=fresh;
				end=fresh;
				return start;
			}
			else
			{
				fresh.next=start;
				end.next=fresh;
				start=fresh;
				return start;
			}
		}
		public static Node InsEnd(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=end=fresh;
				return start;
			}
			else
			{
				end.next=fresh;
				fresh.next=start;
				end=fresh;
				return start;
			}
		}
		public static Node InsAny(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			System.out.println("Enter at position you want to enter the value");
			int c=sc.nextInt();
			if(start==null)
			{
				start=end=fresh;
				return start;
			}
			else if(c>(count(start,end)+1))
			{
				System.out.println("OverFlow");
				return start;
			}
			else if(c==(count(start,end)))
			{
				return InsEnd(start,end);
			}
			else if(c==0)
			{
				return InsBeg(start,end);
			}
			else
			{
				int p=0,j=0;
				Node ptr;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					p++;
					if(p==c-1)
					{
						Node k=ptr.next;
						ptr.next=fresh;
						fresh.next=k;
						j=1;
					}
				}
				if(j==1)
				{
					return start;
				}
				else
				{
					for(ptr=start;ptr!=null;ptr=ptr.next);
					{
						ptr.next=fresh;
					}
					return start;
				}
			}
		}
		public static Node DelBeg(Node start , Node end)
		{
			if(start==null)
			{
				System.out.println("UnderFlow");
				return null;
			}
			else if(start.next==null)
			{
				start=end=null;
				return null;
			}
			else if(start.next.next==end)
			{
				start=start.next;
				end.next=null;
				return start;
			}
			else
			{
				start=start.next;
				end.next=start;
				
				return start;
			}
		}
		public static Node DelEnd(Node start , Node end)
		{
			if(start==null)
			{
				System.out.println("UnderFlow");
				return start;
			}
			else if(start.next==null)
			{
				start=end=null;
				return start;
			}
			else
			{
				Node ptr;
				for(ptr=start.next;ptr.next.next!=end.next;ptr=ptr.next);
				{
					ptr.next=end.next;
				}
				return start;
			}
		}
		public static Node DelAny(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			Node ptr;
			int c,p=0;
			System.out.println("Enter the deletion position");
			c=sc.nextInt();
			if(start==null)
			{
				System.out.println("UnderFlow");
				return start;
			}
			else if(c>count(start,end))
			{
				System.out.println("Not a valid position");
				return start;
			}
			else if(c==count(start,end)+1)
			{
				return DelEnd(start,end);
			}
			else
			{
				for(ptr=start.next;ptr.next!=end.next;ptr=ptr.next)
				{
					p++;
					if(p==c-1)
						break;
				}
				ptr.next=ptr.next.next;
				return start;
			}
		}
		public static void DelReg(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a reg number which is to be deleted");
			int regd=sc.nextInt();
			if(start==null)
				System.out.println("UnderFlow");
			Node ptr;
			int f=0;
			for(ptr=start.next;ptr.next!=end.next;ptr=ptr.next)
			{
				if(ptr.next.regd_no==regd)
				{
					f=1;
					ptr.next=ptr.next.next;
					break;
				}
			}
			if(f==0)
			{
				System.out.println("No such reg Number found");
			}
			else
			{
				System.out.println("The node with the "+regd+" number has been deleted and the updated list is");
				for(ptr=start;ptr!=null;ptr=ptr.next)
					System.out.println(ptr.regd_no+" "+ptr.mark);
			}
		}
		public static void search(Node start , Node end)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a mark which is to be searched and enter the updated one");
			float mark=sc.nextFloat();
			float k=sc.nextFloat();
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Node ptr=start;
				if(mark==ptr.mark)
				{
					ptr.mark=k;
					System.out.println("The reg number is "+ptr.regd_no+" and the updated mark is "+ptr.mark);
					return;
				}
				else
				{
					for(ptr=start.next;ptr!=end.next;ptr=ptr.next)
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
		public static void sort(Node start , Node end)
		{
			if(start==null)
				System.out.println("Empty list");
			Node ptr,k;
			float temp;
			int d;
			for(ptr=start;ptr!=end;ptr=ptr.next)
			{
				for(k=ptr.next;k!=end.next;k=k.next)
				{
					if(ptr.mark<k.mark)
					{
						temp=ptr.mark;
						ptr.mark=k.mark;
						k.mark=temp;
						d=ptr.regd_no;
						ptr.regd_no=k.regd_no;
						k.regd_no=d;
					}
				}
			}
			ptr=start;
			System.out.println("The sorted list is ");
			System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
			for(ptr=start.next;ptr!=end.next;ptr=ptr.next)
			{
				System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
			}
		}
		public static int count(Node start , Node end)
		{
			if(start==null)
				System.out.println("Empty list");
			int c=1;
			for(Node ptr=start;ptr!=end;ptr=ptr.next)
			{
				c++;
			}
			return c;
		}
//		public static Node reverse(Node start , Node end)
//		{
//			int a=count(start,end);
//			if(a>=2)
//			{
//				Node ptr,ptr1,ptr2;
//				for(ptr=null,ptr1=start,ptr2=start.next,ptr1.next=null;ptr2.next!=end.next;ptr2=ptr2.next,ptr1.next=ptr)
//				{
//					ptr=ptr1;
//					ptr1=ptr2;
//				}
//				start=ptr1;
//				return start;
//			}
//			else
//			{
//				System.out.println("Not possible");
//				return start;
//			}
//		}
		public static void display(Node start , Node end)
		{
			if(start.next==null)
				System.out.println("The reg number is "+start.regd_no+" and the mark is "+start.mark);
			else
			{
				Node ptr=start;
				System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
				for(ptr=start.next;ptr!=end.next;ptr=ptr.next)
				{
					System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
				}
			}
		}
	}
