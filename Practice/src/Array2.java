import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4};
		int k=a[0];
		for(int i:a)
		{
			if(k<i)
			{
				k=i;
			}
		}
		System.out.println(k);
		
	}
}
