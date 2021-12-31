import java.util.*;
public class Number10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c,c1;
		int n;
		System.out.println("Enter the starting limit ");
		c=sc.next().charAt(0);
		System.out.println("Enter the ending limit");
		c1=sc.next().charAt(0);
		System.out.println("Enter the number which should be in one line");
		n=sc.nextInt();	
		printChars(c,c1,n);
	}
	static void printChars(char ch1, char ch2, int numberPerLine)
	{
		int i,j;
		for(i=ch1,j=0;i<=ch2;)
		{
			if(j==numberPerLine)
			{
				System.out.println();
				j=0;
			}
			else
			{
				System.out.print((char)i++ +" ");
				j++;
			}
		}
	}
}
