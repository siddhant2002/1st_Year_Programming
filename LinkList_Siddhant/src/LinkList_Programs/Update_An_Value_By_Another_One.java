package LinkList_Programs;
import java.util.*;
public class Update_An_Value_By_Another_One {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hu start=null,prev=null,fresh,ptr;
		int ch;
		do
		{
			fresh=new Hu();
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
		System.out.println("Enter a value which is to be searched for");
		int k=sc.nextInt();
		A nm=new A();
		nm.update_Value(start,k);
	}
}
	class Hu
	{
		int data;
		Hu next;
	}
	class A
	{
		public static void update_Value(Hu start , int n)
		{
			Scanner sc=new Scanner(System.in);
			if(start==null)
				System.out.println("Empty list");
			else
			{
				System.out.println("Enter the new value which is to be updated");
				int k=sc.nextInt();
				int f=0;
				Hu ptr;
				for(ptr=start;ptr!=null;ptr=ptr.next)
				{
					if(ptr.data==n)
					{
						ptr.data=k;
						f=1;
					}
				}
				if(f==0)
					System.out.println("Value not found");
				else
				{
					System.out.println("The updated list is");
					for(ptr=start;ptr!=null;ptr=ptr.next)
					{
						System.out.print(ptr.data+" ");
					}
				}
			}
		}
	}
