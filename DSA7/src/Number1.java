import java.util.Scanner;
public class Number1 {
	
	static int s[];
	static int front=-1,rear=-1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,ch,m;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		s=new int[n];
		do
		{
			System.out.println("Press 1 to insert a element");
			System.out.println("Press 2 to delete a element");
			System.out.println("Press 3 to display a element");
			System.out.println("Press 4 to check whether stack is empty or not");
			System.out.println("Press 5 to check whether stack is full or not");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				push(s);
				break;
			case 2:
				pop(s);
				break;
			case 3:
				display(s);
				break;
			case 4:
				System.out.println(isEmpty());
				break;
			case 5:
				System.out.println(isFull());
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Press 1 to continue");
			m=sc.nextInt();
		}while(m==1);
	}
	public static void push(int a[])
	{
		Scanner sc=new Scanner(System.in);
		if(rear==s.length-1)
		{
			System.out.println("OverFlow");
			return;
		}
		else
		{
			if(front==rear&&front==-1)
			{
				System.out.println("Enter a number");
				front++;
				rear++;
				s[rear]=sc.nextInt();
				return;
			}
			else
			{
				System.out.println("Enter a number");
				rear++;
				s[rear]=sc.nextInt();
				return;
			}
		}
	}
	public static void pop(int a[])
	{
		if(front==-1)
		{
			System.out.println("UnderFlow");
			return;
		}
		else if(front==rear)
		{
			rear=front=-1;
		}
		else
		{
			++front;
			return;
		}
	}
	public static void display(int a[])
	{
		if(front==rear)
			System.out.println("Queue is empty");
		else
		{
			int i;
			for(i=front;i<=rear;i++)
				System.out.print(s[i]+" ");
			System.out.println();
		}
	}
	public static boolean isEmpty()
	{
		if(front==-1||rear==-1)
			return true;
		else
			return false;
	}
	public static boolean isFull()
	{
		if(rear==s.length-1)
			return true;
		else
			return false;
	}
}
