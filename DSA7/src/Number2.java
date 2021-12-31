import java.util.Scanner;
public class Number2 {
	static Node rear=null,front=null;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,m;
		do
		{
			System.out.println("Press 1 to insert a element");
			System.out.println("Press 2 to delete a element");
			System.out.println("Press 3 to display a element");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Press 1 to continue");
			m=sc.nextInt();
		}while(m==1);
	}
	static void insert()
	{
		Scanner sc=new Scanner(System.in);
		Node fresh=new Node();
		System.out.println("Enter a number");
		fresh.info=sc.nextInt();
		if(rear==null)
		{
			rear=front=fresh;
		}
		else
		{
			rear.next=fresh;
			rear=fresh;
		}
	}
	static void delete()
	{
		if(front==null)
		{
			System.out.println("UnderFlow");
			return;
		}
		else if(front.next==null)
		{
			front=null;
		}
		else
		{
			front=front.next;
		}
	}
	static void display()
	{
		if(front==null)
			System.out.println("Queue is empty");
		else
		{
			Node i;
			System.out.println("The numbers are");
			for(i=front;i!=rear;i=i.next)
				System.out.print(i.info+" ");
			System.out.println(i.info);
		}
	}
}
	class Node
	{
		int info;
		Node next;
	}