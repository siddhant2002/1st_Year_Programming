import java.util.*;
public class Assignment4_15 {

	public static void main(String[] args) {
		int i,r;
		for(i=1;i<=5;i++)
		{
			for(r=1;r<=5;r++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		i=1;
		r=1;
		while(i<=5)
		{
			r=1;
			while(r<=5)
			{
				System.out.print("* ");
				r++;
			}
			System.out.println();
			i++;
		}
	}
}


