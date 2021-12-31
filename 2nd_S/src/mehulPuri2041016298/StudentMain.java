package mehulPuri2041016298;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		SinglylinkedList obj =new SinglylinkedList();
		 while(true) {
			 System.out.println("****MENU*****");
		 System.out.println("0:Exit");
		 System.out.println("1:Creation");
		 System.out.println("2:Display");
		 System.out.println("3:Find Topper");
		 System.out.println("4:Failed Students");
		 System.out.println("5:Sort\n");
		 System.out.println("Enter the choice: ");
		 int choice  = sc.nextInt();
		 switch(choice) {
		 case 0:
			 System.exit(0);
		 case 1: 
			 obj.create();
			 break;
		 case 2:
			 obj.displayLinkedList();
			 break;
		 case 3:
			 obj.topper();
			 break;
		 case 4:
			 obj.failedlist();
			 break;
		 case 5:
			 obj.sort();
			 break;
		 }

	}

}
}