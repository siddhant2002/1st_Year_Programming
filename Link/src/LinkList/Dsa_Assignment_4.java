package LinkList;
import java.util.Scanner;
public class Dsa_Assignment_4 {

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
				start=fresh;
			else
				prev.next=fresh;
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
				start=nm.InsBeg(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 2:
				start=nm.InsEnd(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 3:
				start=nm.InsAny(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 4:
				start=nm.DelBeg(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 5:
				start=nm.DelEnd(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 6:
				start=nm.DelAny(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 7:
				nm.DelReg(start);
				break;
			case 8:
				nm.search(start);
				break;
			case 9:
				nm.sort(start);
				break;
			case 10:
				System.out.println("Number of nodes is "+(nm.count(start)));
				break;
			case 11:
				start=nm.reverse(start);
				for(Node tr=start;tr!=null;tr=tr.next)
				{
					System.out.println(tr.regd_no+" "+tr.mark);
				}
				break;
			case 12:
				nm.display(start);
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
		public static Node InsBeg(Node start)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			fresh.next=start;
			start=fresh;
			return start;
		}
		public static Node InsEnd(Node start)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			if(start==null)
			{
				start=fresh;
				return start;
			}
			Node ptr;
			for(ptr=start;ptr.next!=null;ptr=ptr.next);
			{
				ptr.next=fresh;
			}
			return start;
		}
		public static Node InsAny(Node start)
		{
			Scanner sc=new Scanner(System.in);
			Node fresh=new Node();
			System.out.println("Enter your reg number and mark");
			fresh.regd_no=sc.nextInt();
			fresh.mark=sc.nextFloat();
			System.out.println("Enter at which you want to enter the value");
			int c=sc.nextInt();
			if(start==null)
			{
				start=fresh;
				return start;
			}
			else if(c>count(start))
			{
				System.out.println("OverFlow");
				return start;
			}
			else if(c==count(start)+1)
			{
				return InsEnd(start);
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
		public static Node DelBeg(Node start)
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
		public static Node DelEnd(Node start)
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
				Node ptr;
				for(ptr=start;ptr.next.next!=null;ptr=ptr.next);
				{
					ptr.next=null;
				}
				return start;
			}
		}
		public static Node DelAny(Node start)
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
		public static void DelReg(Node start)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a reg number which is to be deleted");
			int regd=sc.nextInt();
			if(start==null)
				System.out.println("UnderFlow");
			Node ptr;
			int f=0;
			for(ptr=start;ptr.next!=null;ptr=ptr.next)
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
		public static void search(Node start)
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
		public static void sort(Node start)
		{
			if(start==null)
				System.out.println("Empty list");
			Node ptr,k;
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				for(k=ptr.next;k!=null;k=k.next)
				{
					float t=ptr.mark;
					ptr.mark=k.mark;
					k.mark=t;
				}
			}
			System.out.println("The sorted list is ");
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
			}
		}
		public static int count(Node start)
		{
			if(start==null)
				System.out.println("Empty list");
			int c=0;
			for(Node ptr=start;ptr!=null;ptr=ptr.next)
			{
				c++;
			}
			return c;
		}
		public static Node reverse(Node start)
		{
			int a=count(start);
			if(a>=2)
			{
				Node ptr,ptr1,ptr2;
				for(ptr=null,ptr1=start,ptr2=start.next,ptr1.next=null;ptr2!=null;ptr2=ptr2.next,ptr1.next=ptr)
				{
					ptr=ptr1;
					ptr1=ptr2;
				}
				start=ptr1;
				return start;
			}
			else
			{
				System.out.println("Not possible");
				return start;
			}
		}
		public static void display(Node start)
		{
			if(start.next==null)
				System.out.println("The reg number is "+start.regd_no+" and the mark is "+start.mark);
			else
			{
				for(Node ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.println("The reg number is "+ptr.regd_no+" and the mark is "+ptr.mark);
				}
			}
		}
	}
