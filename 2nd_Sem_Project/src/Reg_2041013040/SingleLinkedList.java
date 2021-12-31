package Reg_2041013040;
import java.util.*;
public class SingleLinkedList {
	Node start=null;
	void create()
	{
		Scanner sc=new Scanner(System.in);
		Node prev=null,fresh;
		int ch;
		do
		{
			fresh=new Node();
			fresh.stud.setStudentsDetails();
			if(start==null)
				start=fresh;
			else
			prev.link=fresh;
		prev=fresh;
		System.out.println("Enter 1 to continue");
		ch=sc.nextInt();
	}while(ch==1);
	}
	void displayLinkedList()
	{
		if(start==null)
		{
			System.out.println("Empty list");
		}
		Node ptr;
		for(ptr=start;ptr!=null;ptr=ptr.link)
		{
			ptr.stud.displayStudent();
		}
	}
	void findTopper()
	{
		Node ptr;
		double k=start.stud.mark;
		String nm=start.stud.name;
		int r=start.stud.roll;
		if(start==null)
		{
			System.out.println("Empty list");
		}
		for(ptr=start.link;ptr!=null;ptr=ptr.link)
		{
			if(ptr.stud.mark>k)
			{
				k=ptr.stud.mark;
				nm=ptr.stud.name;
				r=ptr.stud.roll;
			}
		}
		System.out.println("The topper is "+nm+" having roll number "+r+" have secured "+k+" marks");
	}
	void displayFailedList()
	{
		Node ptr;
		if(start==null)
		{
			System.out.println("Empty list");
		}
		int c=0;
		System.out.print("The failed students are ");
		for(ptr=start.link;ptr!=null;ptr=ptr.link)
		{
			if(ptr.stud.mark<40)
			{
				System.out.print("\n"+ptr.stud.name+" "+ptr.stud.roll+" "+ptr.stud.mark);
				c++;
			}
		}
		if(c==0)
			System.out.println(c);
	}
	void sort()
	{
		if(start==null)
			System.out.println("Empty list");
		Node ptr,k;
		double temp;
		int d;
		String n;
		for(ptr=start;ptr!=null;ptr=ptr.link)
		{
			for(k=ptr.link;k!=null;k=k.link)
			{
				if(ptr.stud.mark<k.stud.mark)
				{
					temp=ptr.stud.mark;
					ptr.stud.mark=k.stud.mark;
					k.stud.mark=temp;
					d=ptr.stud.roll;
					ptr.stud.roll=k.stud.roll;
					k.stud.roll=d;
					n=ptr.stud.name;
					ptr.stud.name=k.stud.name;
					k.stud.name=n;
				}
			}
		}
		System.out.println("The sorted list is ");
		System.out.println("Name\t\t\tRoll\t\t\tMark");
		for(ptr=start;ptr!=null;ptr=ptr.link)
		{
			System.out.println(ptr.stud.name+"\t\t"+ptr.stud.roll+"\t\t"+ptr.stud.mark);
		}
	}
}

