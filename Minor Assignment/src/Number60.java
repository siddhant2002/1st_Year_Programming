import java.util.*;
public class Number60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int data,i,n;
		String k;
		System.out.println("Enter the data");
		data=sc.nextInt();
		System.out.println("Enter into how many parts will the number be divided");
		n=sc.nextInt();
		k=String.valueOf(data);
		for(i=0;i<n;i++)
		{
			System.out.print(k.charAt(i)+" ");
		}
	}
}
