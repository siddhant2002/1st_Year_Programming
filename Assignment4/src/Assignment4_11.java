import java.util.*;
public class Assignment4_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		double s=0,s1=0;
		for(i=1;i<=n;i++)
		{
			s+=Math.pow(i,2);
			s1+=i;
		}
		System.out.println("The difference is "+(int)(Math.pow(s1,2)-s)+".");
	}

}
