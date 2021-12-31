import java.util.*;
public class Node {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Azam start=null,prev = null,fresh,ptr;
			int ch;
			do
			{
				fresh=new Azam();
				System.out.println("Enter the value");
				fresh.e=sc.nextInt();
				if(start==null)
					start=fresh;
				else
				prev.rohan=fresh;
			prev=fresh;
			System.out.println("Enter 1 to continue");
			ch=sc.nextInt();
		}while(ch==1);
		for(ptr=start;ptr!=null;ptr=ptr.rohan)
		{
			System.out.println(ptr.e+" "+ptr.rohan);
		}
	}
}
	class Azam
	{
		int e;
		Azam rohan;
	}
