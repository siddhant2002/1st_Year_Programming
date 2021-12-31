import java.util.Scanner;
public class Node3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Azam3 start=null,prev = null,fresh,ptr;
		int ch,c=0;
		do
		{
			fresh=new Azam3();
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
		for(ptr=start;ptr.next!=null;ptr=ptr.next)
		{
			if(ptr.next.next==null)
				System.out.println(ptr.data);
		}
		
	}
}
	class Azam3
	{
		int data;
		Azam3 next;
	}
