package LinkList_Programs;
import java.util.*;
public class Task_Lecture_Number_22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Alpha start=null,prev=null,fresh,ptr;
		int ch,p;
		do
		{
			fresh=new Alpha();
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
		do
		{
			System.out.println("Press 1 to count number of non zero elements");
			System.out.println("Press 2 to count number of even's");
			System.out.println("Press 3 to count by element");
			System.out.println("Press 4 to search last element");
			System.out.println("Press 5 to search second last element");
			ch=sc.nextInt();
			Works nm=new Works();
			switch(ch)
			{
			case 1:
				nm.count_NonZero(start);
				break;
			case 2:
				nm.count_Number_Of_Evens(start);
				break;
			case 3:
				nm.count_By_Element(start);
				break;
			case 4:
				nm.search_Last_Element(start);
				break;
			case 5:
				nm.search_Second_Last_Element(start);
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Press 1 to do next operation else press any number to terminate");
			p=sc.nextInt();
		}while(p==1);
	}
}
	class Alpha
	{
		int data;
		Alpha next;
	}
	class Works
	{
		public static void count_NonZero(Alpha start)
		{
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Alpha ptr;
				int c=0;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(ptr.data!=0)
						c++;
				}
				System.out.println("The number of nonzero elements are "+c);
			}
		}
		public static void count_Number_Of_Evens(Alpha start)
		{
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Alpha ptr;
				int c=0;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(ptr.data%2==0)
						c++;
				}
				System.out.println("The number of even elements are "+c);
			}
		}
		public static void count_By_Element(Alpha start)
		{
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Alpha ptr;
				int c=0;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					c++;
				}
				System.out.println("The number of elements present in the list are"+c);
			}
		}
		public static void search_Last_Element(Alpha start)
		{
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Alpha ptr;
				for(ptr=start;ptr!=null;ptr=ptr.next);
				{
					System.out.println("The last element is "+ptr.data);
				}
			}
		}
		public static void search_Second_Last_Element(Alpha start)
		{
			if(start==null)
				System.out.println("Empty list");
			else
			{
				Alpha ptr;
				for(ptr=start;ptr.next!=null;ptr=ptr.next);
				{
					System.out.println("The last element is "+ptr.data);
				}
			}
		}
	}
