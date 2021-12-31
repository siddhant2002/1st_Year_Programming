import java.util.*;
public class Number2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,m;
		Node top=null;
		do
		{
			System.out.println("Press 1 to insert a element");
			System.out.println("Press 2 to delete a element");
			System.out.println("Press 3 to display a element");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				top=push(top);
				break;
			case 2:
				top=pop(top);
				break;
			case 3:
				display(top);
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Press 1 to continue");
			m=sc.nextInt();
		}while(m==1);
	}
	public static Node push(Node top)
	{
		Scanner sc=new Scanner(System.in);
		if(top==null)
		{
			Node fresh=new Node();
			System.out.println("Enter a number");
			fresh.info=sc.nextInt();
			top=fresh;
			return top;
		}
		else
		{
			Node ptr,fresh=new Node();
			System.out.println("Enter a number");
			fresh.info=sc.nextInt();
			for(ptr=top;ptr.next!=null;ptr=ptr.next);
			ptr.next=fresh;
			return top;
		}
	}
	public static Node pop(Node top)
	{
		if(top==null)
		{
			System.out.println("UnderFlow");
			return null;
		}
		else if(top.next==null)
		{
			top=null;
			return top;
		}
		else
		{
			Node ptr;
			for(ptr=top;ptr.next.next!=null;ptr=ptr.next);
			ptr.next=null;
			return top;
		}
	}
	public static void display(Node top)
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
		{
			Node i;
			System.out.println("The numbers are");
			for(i=top;i!=null;i=i.next)
				System.out.print(i.info+" ");
			System.out.println();
		}
	}
}
	class Node
	{
		int info;
		Node next;
	}
