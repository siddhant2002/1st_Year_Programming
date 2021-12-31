import java.util.*;
public class Assignment2_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d,m;
		d=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
		if(m>=3&&m<=6)
		{
			if((m==3&&d>20)||(m==6&&d<20))
			{
				System.out.println("true");
			}
			else if(m==4||m==5)
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
		else
			System.out.println("false");
	}

}
