import java.util.*;
public class Number1 {
	
	static int s[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,top=-1,ch,m;
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
				top=push(top);
				break;
			case 2:
				top=pop(top);
				break;
			case 3:
				display(top);
				break;
			case 4:
				System.out.println(isEmpty(top));
				break;
			case 5:
				System.out.println(isFull(top));
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Press 1 to continue");
			m=sc.nextInt();
		}while(m==1);
	}
	public static int push(int top)
	{
		Scanner sc=new Scanner(System.in);
		if(top==s.length-1)
		{
			System.out.println("OverFlow");
			return top;
		}
		else
		{
			System.out.println("Enter a number");
			s[++top]=sc.nextInt();
			return top;
		}
	}
	public static int pop(int top)
	{
		if(top==-1)
		{
			System.out.println("UnderFlow");
			return top;
		}
		else
		{
			return --top;
		}
	}
	public static void display(int top)
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			int i;
			for(i=0;i<=top;i++)
				System.out.print(s[i]+" ");
		}
	}
	public static boolean isEmpty(int top)
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public static boolean isFull(int top)
	{
		if(top<s.length-1)
			return false;
		else
			return true;
	}
}
