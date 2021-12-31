import java.util.Scanner;
public class Node1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Azam1 start=null,prev = null,fresh,ptr;
		int ch,c=0;
		do
		{
			fresh=new Azam1();
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
		for(ptr=start;ptr!=null;ptr=ptr.next)
		{
			c++;
		}
		System.out.println("Number of nodes is "+c);
	}
}
	class Azam1
	{
		int data;
		Azam1 next;
	}
