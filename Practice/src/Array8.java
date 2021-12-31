import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a[]=new double[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(i%2==0)
				a[i]=(int)a[i];
		}
	}

}
