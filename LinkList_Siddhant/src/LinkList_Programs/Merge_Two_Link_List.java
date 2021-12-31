package LinkList_Programs;
import java.util.*;
public class Merge_Two_Link_List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Zoo start=null,prev=null,fresh,ptr;
		int ch,p;
		System.out.println("Enter the numbers of the 1st linklist");
		do
		{
			fresh=new Zoo();
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
		Zoo start1=null,prev1=null,fresh1,ptr1;
		System.out.println("Enter the numbers of the 2nd linklist");
		do
		{
			fresh1=new Zoo();
			System.out.println("Enter a number");
			fresh1.data=sc.nextInt();
			if(start1==null)
				start1=fresh1;
			else
				prev1.next=fresh1;
			prev1=fresh1;
			System.out.println("Enter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
		Task1 nm=new Task1();
		nm.mergeList(start,start1);
	}
}
	class Zoo
	{
		int data;
		Zoo next;
	}
	class Task1
	{
		public static void mergeList(Zoo start , Zoo end)
		{
			Zoo ptr;
			for(ptr=start;ptr.next!=null;ptr=ptr.next);
			{
				ptr.next=end;
			}
			System.out.println("The merged list is ");
			for(ptr=start;ptr!=null;ptr=ptr.next)
			{
				System.out.print(ptr.data+" ");
			}
		}
	}
