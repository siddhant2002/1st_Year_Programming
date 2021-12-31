import java.util.*;
public class Manas1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int i,c=0;
		System.out.println("Enter the ages of 100 persons");
		for(i=0;i<100;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>50&&a[i]<=60)
				c++;
		}
		System.out.println("Number of persons in the age group 50 to 60 is "+c);
	}
}
