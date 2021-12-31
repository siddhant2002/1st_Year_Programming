import java.util.Scanner;
public class Node2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Azam2 start=null,prev = null,fresh,ptr;
		int ch,c=0,n,p=0;
		do
		{
			fresh=new Azam2();
			System.out.println("Enter the value");
			fresh.data=sc.nextInt();
			if(start==null)
				start=fresh;
			else
				prev.next=fresh;
			prev=fresh;
			System.out.println("Enter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Enter a element to be deleted");
		n=sc.nextInt();
		for(ptr=start;ptr!=null;ptr=ptr.next)
		{
			if(ptr.data==n)
				break;
			c++;
		}
		for(ptr=start;ptr!=null;ptr=ptr.next)
		{
			p++;
			if(p==c)
				break;
		}
		if(ptr==null)
			System.out.println("Not a valid position");
		else
			ptr.next=ptr.next.next;
		System.out.println("The list after deletion is ");
		for(ptr=start;ptr!=null;ptr=ptr.next)
		{
			System.out.print(ptr.data+" ");
		}
	}
}
	class Azam2
	{
		int data;
		Azam2 next;
	}