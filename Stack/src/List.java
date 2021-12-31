import java.util.*;
public class List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> nm= new LinkedList<String>();
		LinkedList<Integer> age= new LinkedList<Integer>();
		LinkedList<Integer> reg= new LinkedList<Integer>();
		LinkedList<Integer> ph= new LinkedList<Integer>();
		int i,a,r,p,c,ch=0;
		String n;
		do
		{
			System.out.println("Enter name, age, reg Number, phone number of the participant ");
			n=sc.next();
			a=sc.nextInt();
			r=sc.nextInt();
			p=sc.nextInt();
			c=0;
			for(i=0;i<age.size();i++)
			{
				if(a==age.get(i))
					c++;
			}
			if(c>4)
				continue;
			else
			{
				nm.add(n);
				age.add(a);
				reg.add(r);
				ph.add(p);
			}
			System.out.println("Press 1 for the next participant");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("The list of the gammers participants are ");
		for(i=0;i<nm.size();i++)
		{
			System.out.println("Name is "+nm.get(i)+" Age is "+age.get(i)+" Reg Number is "+reg.get(i)+" Phone number is "+ph.get(i));
		}
	}
}
