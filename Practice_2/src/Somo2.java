import java.util.*;
public class Somo2 {
	public static void main(String[] args) {
		Chomo nm=new Chomo();
		nm.create();
		nm.display();
		nm.delBeg();
		nm.delEnd();
		nm.delLoc();
		nm.display();
	}
}
	class Chomo{
		Node7 head = null;
		Scanner sc = new Scanner(System.in);
		int info; 
		Object link;
		public void create() {
			Node7 p = new Node7();
			System.out.println("Input info  ");
			p.info = sc.nextInt();
			p.link = null;
			head = p;
			System.out.println("Do you want more nodes? (y/n) ");
			char ch = sc.next().charAt(0);
			while(ch == 'y') 
			{
				Node7 q = new Node7();
				System.out.println("Input info   ");
				q.info = sc.nextInt();
				q.link = null;
				p.link = q;
				p = q;
				System.out.println("Do you want more nodes? (y/n) ");
				ch = sc.next().charAt(0);
			}
		}
		public void display() {
			Node7 temp = head;
			System.out.println("Start = "+head);
			while(temp != null)
			{
				System.out.println(temp.info+" "+temp.link);
				temp = temp.link;
			}
			System.out.println("\n");
		}
		public void delBeg()
		{
			if(head == null)
			{
				System.out.println("Underflow");
				return;
			}
			head = head.link;
		}
		public void delEnd()
		{
			if(head == null)
			{
				System.out.println("Underflow");
				return;
			}
			if (head.link == null)
			{
				delBeg();
			}
			else
			{
				Node7 temp = head;
				while(temp.link != null)
					temp =temp.link;
				temp.link = null;
			}
		}
		public void delLoc() {
			System.out.print("Input node number  ");
			int loc = sc.nextInt();
			int c = count();
			if(loc <= c+1)
			{
				if (head == null)
					System.out.println("Underflow");
				if(loc ==1)
					delBeg();
				else if(loc == c+1)
					delEnd();
				else
				{
					Node7 temp = head;
					int cnt = 1;
					while(cnt < loc-1)
					{
						cnt++;
						temp = temp.link;
					}
					temp.link = temp.link;
				}
			}
		}
		public int count() {
			int count = 0;
			Node7 temp = head;
			while(temp != null) 
			{
				count = count+1;
				temp = temp.link;
			}
			return count;
		}
	}
	class Node7
	{
		int info;
		Node7 link;
	}