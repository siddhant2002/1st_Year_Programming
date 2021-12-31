package LinkList_Programs;
import java.util.*;
public class Lecture_Number_22_Q_3_And_Q_4 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ZooZoo start=null,prev=null,fresh,ptr;
		int ch,p;
		do
		{
			fresh=new ZooZoo();
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
		Task nm=new Task();
		nm.insert_Before(start);
		nm.insert_After(start);
		nm.insert_Before_Each(start);
		nm.insert_After_Each(start);
	}
}
	class ZooZoo
	{
		int data;
		ZooZoo next;
	}
	class Task
	{
		public static void insert_Before(ZooZoo start)
		{
			if(start==null)
				System.out.println("Empty List");
			else
			{
				Scanner sc=new Scanner(System.in);
				int n;
				System.out.println("Enter a value which is to be searched");
				n=sc.nextInt();
				ZooZoo ptr,fresh,k;
				for(ptr=start;ptr.next!=null;ptr=ptr.next)
				{
					if(ptr.next.data==n)
					{
						fresh=new ZooZoo();
						System.out.println("Enter a value to be inserted");
						fresh.data=sc.nextInt();
						k=ptr.next;
						ptr.next=fresh;
						ptr.next.next=k;
						break;
					}
				}
				System.out.println("The updated list is ");
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.print(ptr.data+" ");
				}
			}
		}
		public static void insert_After(ZooZoo start)
		{
			if(start==null)
				System.out.println("Empty List");
			else
			{
				Scanner sc=new Scanner(System.in);
				int n;
				System.out.println("Enter a value which is to be searched");
				n=sc.nextInt();
				ZooZoo ptr,fresh,k;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(ptr.data==n)
					{
						fresh=new ZooZoo();
						System.out.println("Enter a value to be inserted");
						fresh.data=sc.nextInt();
						k=ptr.next;
						ptr.next=fresh;
						ptr.next.next=k;
						break;
					}
				}
				System.out.println("The updated list is ");
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.print(ptr.data+" ");
				}
			}
		}
		public static void insert_Before_Each(ZooZoo start)
		{
			if(start==null)
				System.out.println("Empty List");
			else
			{
				Scanner sc=new Scanner(System.in);
				int n;
				System.out.println("Enter a value which is to be searched");
				n=sc.nextInt();
				ZooZoo ptr,fresh,k;
				for(ptr=start;ptr.next!=null;ptr=ptr.next)
				{
					if(ptr.next.data==n)
					{
						fresh=new ZooZoo();
						System.out.println("Enter a value to be inserted");
						fresh.data=sc.nextInt();
						k=ptr.next;
						ptr.next=fresh;
						ptr.next.next=k;
						break;
					}
				}
				System.out.println("The updated list is ");
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.print(ptr.data+" ");
				}
			}
		}
		public static void insert_After_Each(ZooZoo start)
		{
			if(start==null)
				System.out.println("Empty List");
			else
			{
				Scanner sc=new Scanner(System.in);
				int n;
				System.out.println("Enter a value which is to be searched");
				n=sc.nextInt();
				ZooZoo ptr,fresh,k;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(ptr.data==n)
					{
						fresh=new ZooZoo();
						System.out.println("Enter a value to be inserted");
						fresh.data=sc.nextInt();
						k=ptr.next;
						ptr.next=fresh;
						ptr.next.next=k;
						break;
					}
				}
				System.out.println("The updated list is ");
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					System.out.print(ptr.data+" ");
				}
			}
		}
	}
