package mehulPuri2041016298;
import java.util.Scanner;
public class SinglylinkedList {
	Scanner sc =new Scanner(System.in);
	Node start;
	void create() {						// create method
		Node x =new Node();
		x.stud = new Student();
		x.link=null;
		start =x;
		System.out.println("Do you want to add more Students? (y/n): ");
		char inp =sc.next().charAt(0);
		while(inp!='n') {
			Node y =new Node();
			y.stud= new Student();
			y.link =null;
			x.link=y;
			x=y;
			System.out.println("Do you want to add more Students? (y/n): ");
			inp= sc.next().charAt(0);
		}
	}
	void displayLinkedList() {			//displaying the list
		Node x = start;
		while(x!=null) {
			System.out.println("Name :"+x.stud.name+"\nMarks : "+ x.stud.marks+ "\nRoll: "+x.stud.roll+"\n\n");
			
			x= x.link;
			
		}
	
	}
	void topper() {						//displaying topper details
		Node x =start;
		double marks=0;
		String name=start.stud.name;
		int rno=start.stud.roll;
		if(start==null)
			System.out.println("Empty List");
		else {
			while(x!= null) {
			if(x.stud.marks>marks) {
				marks=x.stud.marks;
				name =x.stud.name;
				rno= x.stud.roll;
				
			}x=x.link;
		}System.out.println("The Topper is "+name+" \nRoll number: "+rno+" \nwith Marks: "+marks);
	}
  }
	void failedlist() {					// List of failed Students
		Node x= start;
		int y=0;
		if(start==null) {
			System.out.println("Empty List");
		}
		else {
			System.out.println("List of failed Students: ");
			while(x!=null) {
				if(x.stud.marks<40) {
				System.out.println("Name :"+x.stud.name+"\nMarks : "+ x.stud.marks+ "\nRoll: "+x.stud.roll+"\n\n");
				
				y++;
				}x=x.link;
			}
			if(y==0) {
				System.out.println("0 students failed");
		}
		}
	}	
	
	void sort() {						//Sorting in descending order of marks
		Node x =start ;
		Node y= x.link;
		double nmarks;
		int nroll;
		String nname;
		while(x!=null)
		{
			y=x.link;
			while(y!=null)
			{
				if(x.stud.marks<y.stud.marks)
				 {
					nmarks=x.stud.marks;
					x.stud.marks=y.stud.marks;
					y.stud.marks=nmarks;
					
					nroll= x.stud.roll;
					x.stud.roll=y.stud.roll;
					y.stud.roll=nroll;
					
					nname=x.stud.name;
					x.stud.name=y.stud.name;
					y.stud.name =nname;
					
				 }
				y=y.link;
			}
			x=x.link;
		}
		System.out.println("The Sorted List is: ");
		for(x=start;x!=null;x=x.link) {
			System.out.println("Name :"+x.stud.name+"\nMarks : "+ x.stud.marks+ "\nRoll: "+x.stud.roll+"\n\n");
		}
	}
}
