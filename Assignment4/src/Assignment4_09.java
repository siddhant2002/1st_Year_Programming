import java.util.*;
public class Assignment4_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,s=0;
		for(i=1;i<1000;i++)
		{
			if(i%3==0||i%5==0)
			{
				s+=i;
			}
		}
		System.out.println("The sum of the multiples of 3 or 5 below 1000 is "+s);
	}
}
