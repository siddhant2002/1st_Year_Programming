import java.util.*;
public class Manas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,d;
		String p="";
		System.out.println("Enter a 4 digit number");
		n=sc.nextInt();
		if(String.valueOf(n).length()==4)
		{
			while(n!=0)
			{
				d=n%10;
				d=d+2;
				if(d>=10)
					d=Integer.parseInt(String.valueOf(d).substring(String.valueOf(d).length()-1));
				p=d+p;
				n/=10;
			}
			n=Integer.parseInt(p);
			System.out.println("The number is "+n);
		}
		else
			System.out.println("Invalid Input. Enter a 4-digit number");
		
	}
}
