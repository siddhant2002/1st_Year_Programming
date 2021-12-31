import java.util.*;
public class Assignment4_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		String mes;
		System.out.println("Enter a message");
		mes=sc.nextLine();
		while(i<=10)
		{
			if(i==1)
			{
				System.out.println(i+"st "+mes);
			}
			else if(i==2)
			{
				System.out.println(i+"nd "+mes);
			}
			else if(i==3)
			{
				System.out.println(i+"rd "+mes);			
			}
			else
			{
				System.out.println(i+"th "+mes);
			}
			i++;
		}
	}

}
